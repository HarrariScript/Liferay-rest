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
 * Provides a wrapper for {@link TMessageLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see TMessageLocalService
 * @generated
 */
@ProviderType
public class TMessageLocalServiceWrapper implements TMessageLocalService,
	ServiceWrapper<TMessageLocalService> {
	public TMessageLocalServiceWrapper(
		TMessageLocalService tMessageLocalService) {
		_tMessageLocalService = tMessageLocalService;
	}

	@Override
	public tanger.med.core.model.TMessage addTMessage(String title,
		String content,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return _tMessageLocalService.addTMessage(title, content, serviceContext);
	}

	/**
	* Adds the t message to the database. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was added
	*/
	@Override
	public tanger.med.core.model.TMessage addTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return _tMessageLocalService.addTMessage(tMessage);
	}

	/**
	* Creates a new t message with the primary key. Does not add the t message to the database.
	*
	* @param messageId the primary key for the new t message
	* @return the new t message
	*/
	@Override
	public tanger.med.core.model.TMessage createTMessage(long messageId) {
		return _tMessageLocalService.createTMessage(messageId);
	}

	/**
	* @throws PortalException
	*/
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tMessageLocalService.deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the t message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t message
	* @return the t message that was removed
	* @throws PortalException if a t message with the primary key could not be found
	*/
	@Override
	public tanger.med.core.model.TMessage deleteTMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tMessageLocalService.deleteTMessage(messageId);
	}

	/**
	* Deletes the t message from the database. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was removed
	*/
	@Override
	public tanger.med.core.model.TMessage deleteTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return _tMessageLocalService.deleteTMessage(tMessage);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _tMessageLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tMessageLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tanger.med.core.model.impl.TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return _tMessageLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tanger.med.core.model.impl.TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return _tMessageLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return _tMessageLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return _tMessageLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public tanger.med.core.model.TMessage fetchTMessage(long messageId) {
		return _tMessageLocalService.fetchTMessage(messageId);
	}

	/**
	* Returns the t message matching the UUID and group.
	*
	* @param uuid the t message's UUID
	* @param groupId the primary key of the group
	* @return the matching t message, or <code>null</code> if a matching t message could not be found
	*/
	@Override
	public tanger.med.core.model.TMessage fetchTMessageByUuidAndGroupId(
		String uuid, long groupId) {
		return _tMessageLocalService.fetchTMessageByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return _tMessageLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return _tMessageLocalService.getExportActionableDynamicQuery(portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return _tMessageLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	@Override
	public String getOSGiServiceIdentifier() {
		return _tMessageLocalService.getOSGiServiceIdentifier();
	}

	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tMessageLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the t message with the primary key.
	*
	* @param messageId the primary key of the t message
	* @return the t message
	* @throws PortalException if a t message with the primary key could not be found
	*/
	@Override
	public tanger.med.core.model.TMessage getTMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tMessageLocalService.getTMessage(messageId);
	}

	/**
	* Returns the t message matching the UUID and group.
	*
	* @param uuid the t message's UUID
	* @param groupId the primary key of the group
	* @return the matching t message
	* @throws PortalException if a matching t message could not be found
	*/
	@Override
	public tanger.med.core.model.TMessage getTMessageByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return _tMessageLocalService.getTMessageByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns a range of all the t messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link tanger.med.core.model.impl.TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @return the range of t messages
	*/
	@Override
	public java.util.List<tanger.med.core.model.TMessage> getTMessages(
		int start, int end) {
		return _tMessageLocalService.getTMessages(start, end);
	}

	/**
	* Returns all the t messages matching the UUID and company.
	*
	* @param uuid the UUID of the t messages
	* @param companyId the primary key of the company
	* @return the matching t messages, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<tanger.med.core.model.TMessage> getTMessagesByUuidAndCompanyId(
		String uuid, long companyId) {
		return _tMessageLocalService.getTMessagesByUuidAndCompanyId(uuid,
			companyId);
	}

	/**
	* Returns a range of t messages matching the UUID and company.
	*
	* @param uuid the UUID of the t messages
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching t messages, or an empty list if no matches were found
	*/
	@Override
	public java.util.List<tanger.med.core.model.TMessage> getTMessagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tanger.med.core.model.TMessage> orderByComparator) {
		return _tMessageLocalService.getTMessagesByUuidAndCompanyId(uuid,
			companyId, start, end, orderByComparator);
	}

	/**
	* Returns the number of t messages.
	*
	* @return the number of t messages
	*/
	@Override
	public int getTMessagesCount() {
		return _tMessageLocalService.getTMessagesCount();
	}

	/**
	* Updates the t message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was updated
	*/
	@Override
	public tanger.med.core.model.TMessage updateTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return _tMessageLocalService.updateTMessage(tMessage);
	}

	@Override
	public TMessageLocalService getWrappedService() {
		return _tMessageLocalService;
	}

	@Override
	public void setWrappedService(TMessageLocalService tMessageLocalService) {
		_tMessageLocalService = tMessageLocalService;
	}

	private TMessageLocalService _tMessageLocalService;
}