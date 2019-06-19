package tanger.med.core.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.PermissionChecker;

import tanger.med.core.model.TMessage;

public interface TMessagePermission {
	public boolean hasAddPermission(PermissionChecker permissionChecker, long userId) throws PortalException;
	
	public boolean hasViewPermission(PermissionChecker permissionChecker, TMessage offer) throws PortalException;

	public boolean hasViewPermission(PermissionChecker permissionChecker, long tMessageId) throws PortalException;
	
}
