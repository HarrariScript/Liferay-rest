/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tanger.med.core.service;

import aQute.bnd.annotation.ProviderType;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the remote service utility for TMessage. This utility wraps
 * {@link tanger.med.core.service.impl.TMessageServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see TMessageService
 * @see tanger.med.core.service.base.TMessageServiceBaseImpl
 * @see tanger.med.core.service.impl.TMessageServiceImpl
 * @generated
 */
@ProviderType
public class TMessageServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tanger.med.core.service.impl.TMessageServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static tanger.med.core.model.TMessage addTMessage(String title,
		String content,
		com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.security.auth.PrincipalException,
			com.liferay.portal.kernel.exception.PortalException {
		return getService().addTMessage(title, content, serviceContext);
	}

	public static java.util.List<tanger.med.core.model.TMessage> getAllTMessage(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().getAllTMessage(serviceContext);
	}

	public static tanger.med.core.model.TMessage getMessage(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().getMessage(serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static TMessageService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TMessageService, TMessageService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TMessageService.class);

		ServiceTracker<TMessageService, TMessageService> serviceTracker = new ServiceTracker<TMessageService, TMessageService>(bundle.getBundleContext(),
				TMessageService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}