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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link TMessageService}.
 *
 * @author Brian Wing Shun Chan
 * @see TMessageService
 * @generated
 */
@ProviderType
public class TMessageServiceWrapper implements TMessageService,
	ServiceWrapper<TMessageService> {
	public TMessageServiceWrapper(TMessageService tMessageService) {
		_tMessageService = tMessageService;
	}

	@Override
	public java.util.List<tanger.med.core.model.TMessage> getAllTMessage(
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _tMessageService.getAllTMessage(serviceContext);
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _tMessageService.getOSGiServiceIdentifier();
	}

	@Override
	public TMessageService getWrappedService() {
		return _tMessageService;
	}

	@Override
	public void setWrappedService(TMessageService tMessageService) {
		_tMessageService = tMessageService;
	}

	private TMessageService _tMessageService;
}