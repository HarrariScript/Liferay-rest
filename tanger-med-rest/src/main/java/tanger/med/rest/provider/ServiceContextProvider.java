package tanger.med.rest.provider;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.GroupConstants;
import com.liferay.portal.kernel.service.GroupLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.service.UserLocalService;
import com.liferay.portal.kernel.util.Portal;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.ext.Provider;

import org.apache.cxf.jaxrs.ext.ContextProvider;
import org.apache.cxf.message.Message;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = ServiceContextProvider.class)
@Provider
public class ServiceContextProvider implements ContextProvider<ServiceContext> {

	private static final String PROPKEY_HTTP_REQUEST = "HTTP.REQUEST";

	private static final Log _log = LogFactoryUtil.getLog(ServiceContextProvider.class);

	@Override
	public ServiceContext createContext(Message message) {
		ServiceContext serviceContext = null;

		// get the current HttpServletRequest for building the service context instance.
		HttpServletRequest request = (HttpServletRequest) message.getContextualProperty(PROPKEY_HTTP_REQUEST);

		try {
			// now we can create a service context
			serviceContext = ServiceContextFactory.getInstance(request);

			if (serviceContext.getCompanyId() <= 0) {
				serviceContext.setCompanyId(_portal.getDefaultCompanyId());
			}

			if (serviceContext.getScopeGroupId() <= 0) {
				serviceContext.setScopeGroupId(
						_group.getGroup(serviceContext.getCompanyId(), GroupConstants.GUEST).getGroupId());
			}

			if (serviceContext.getUserId() <= 0) {
				serviceContext.setUserId(_userLocalService.getDefaultUserId(serviceContext.getCompanyId()));
			}

			// done!
		} catch (PortalException e) {
			_log.warn("Impossible de créer le contexte 'serviceContext'" + e.getMessage(), e);
		}

		// return the new instance.
		return serviceContext;
	}

	@Reference
	private Portal _portal;

	@Reference
	private GroupLocalService _group;

	@Reference
	private UserLocalService _userLocalService;

}