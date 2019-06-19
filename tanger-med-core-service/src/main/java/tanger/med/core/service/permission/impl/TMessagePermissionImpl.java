package tanger.med.core.service.permission.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.component.annotations.ReferenceCardinality;
import org.osgi.service.component.annotations.ReferencePolicy;

import tanger.med.core.model.TMessage;
import tanger.med.core.service.TMessageLocalService;
import tanger.med.core.service.permission.TMessagePermission;
@Component(service = TMessagePermission.class)

public class TMessagePermissionImpl implements TMessagePermission {
	
	Log _log = LogFactoryUtil.getLog(getClass());
    
	private final static String ADD = "ADD_TMESSAGE";
	private final static String VIEW = "GET_TMESSAGE";
	private final static String MODEL_PARENT_NAME = TMessage.class.getPackage().getName();

	
	public boolean contains(PermissionChecker permissionChecker, TMessage tMessage, String actionId) throws PortalException {
		long groupId = tMessage.getGroupId();
		String className = TMessage.class.getName();
		long tMessageId = tMessage.getMessageId();

		if (_log.isDebugEnabled()) {
			_log.debug("vérifier si l'utilisateur peut modifier la ressource " + tMessageId);
		}

		return permissionChecker.hasPermission(groupId, className, tMessageId, actionId);
	}
	public boolean contains(PermissionChecker permissionChecker, long tMessageId, String actionId) throws PortalException {
		TMessage tMessage = _tMessageLocalService.getTMessage(tMessageId);
		return this.contains(permissionChecker, tMessage, actionId);
	}
	
	@Override
	public boolean hasAddPermission(PermissionChecker permissionChecker, long groupId) throws PortalException {
		return permissionChecker.hasPermission(groupId, MODEL_PARENT_NAME, 0, ADD);
		
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker, TMessage tMessage) throws PortalException {
		  return this.contains(permissionChecker, tMessage, VIEW);
	}

	@Override
	public boolean hasViewPermission(PermissionChecker permissionChecker, long tMessageId) throws PortalException {
		return this.contains(permissionChecker, tMessageId, VIEW);
		
	}
	
	
	@Reference(unbind = "setOfferLocalService", cardinality = ReferenceCardinality.OPTIONAL, policy = ReferencePolicy.DYNAMIC)
	protected void setOfferLocalService(TMessageLocalService tMessageLocalService) {
		_tMessageLocalService = tMessageLocalService;
	}

	private TMessageLocalService _tMessageLocalService;
	

}
