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

package tanger.med.core.service.impl;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.PrincipalException;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.util.List;

import tanger.med.core.model.TMessage;
import tanger.med.core.service.base.TMessageServiceBaseImpl;
import tanger.med.core.service.permission.TMessagePermission;

/**
 * The implementation of the t message remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link tanger.med.core.service.TMessageService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have security checks based on the propagated JAAS credentials because this service can be accessed remotely.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TMessageServiceBaseImpl
 * @see tanger.med.core.service.TMessageServiceUtil
 */
public class TMessageServiceImpl extends TMessageServiceBaseImpl {
	Log _log = LogFactoryUtil.getLog(TMessageServiceImpl.class);
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Always use {@link tanger.med.core.service.TMessageServiceUtil} to access the t message remote service.
	 */
	public List<TMessage> getAllTMessage(ServiceContext serviceContext ){
		_log.info("done ");
		 return tMessageLocalService.getTMessages(0, 10);
	}
	public TMessage addTMessage(String title , String content  , ServiceContext serviceContext ) throws PrincipalException, PortalException {
		
		if(!_tMessagePermission.hasAddPermission(getPermissionChecker(), serviceContext.getUserId())) {
			throw new PrincipalException("user-has-no-permission-to-add-tMessage");
		 }
		 return tMessageLocalService.addTMessage(title, content, serviceContext);
	}
	public TMessage getMessage(ServiceContext serviceContext ) {
		 return null ;
	}
	
	@ServiceReference(type = TMessagePermission.class)
	TMessagePermission _tMessagePermission; 
	
	
}