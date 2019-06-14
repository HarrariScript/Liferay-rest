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
 * Provides the local service utility for TMessage. This utility wraps
 * {@link tanger.med.core.service.impl.TMessageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see TMessageLocalService
 * @see tanger.med.core.service.base.TMessageLocalServiceBaseImpl
 * @see tanger.med.core.service.impl.TMessageLocalServiceImpl
 * @generated
 */
@ProviderType
public class TMessageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link tanger.med.core.service.impl.TMessageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */
	public static tanger.med.core.model.TMessage addTMessage(String title,
		String content,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {
		return getService().addTMessage(title, content, serviceContext);
	}

	/**
	* Adds the t message to the database. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was added
	*/
	public static tanger.med.core.model.TMessage addTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return getService().addTMessage(tMessage);
	}

	/**
	* Creates a new t message with the primary key. Does not add the t message to the database.
	*
	* @param messageId the primary key for the new t message
	* @return the new t message
	*/
	public static tanger.med.core.model.TMessage createTMessage(long messageId) {
		return getService().createTMessage(messageId);
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	/**
	* Deletes the t message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t message
	* @return the t message that was removed
	* @throws PortalException if a t message with the primary key could not be found
	*/
	public static tanger.med.core.model.TMessage deleteTMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteTMessage(messageId);
	}

	/**
	* Deletes the t message from the database. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was removed
	*/
	public static tanger.med.core.model.TMessage deleteTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return getService().deleteTMessage(tMessage);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static tanger.med.core.model.TMessage fetchTMessage(long messageId) {
		return getService().fetchTMessage(messageId);
	}

	/**
	* Returns the t message matching the UUID and group.
	*
	* @param uuid the t message's UUID
	* @param groupId the primary key of the group
	* @return the matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public static tanger.med.core.model.TMessage fetchTMessageByUuidAndGroupId(
		String uuid, long groupId) {
		return getService().fetchTMessageByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the t message with the primary key.
	*
	* @param messageId the primary key of the t message
	* @return the t message
	* @throws PortalException if a t message with the primary key could not be found
	*/
	public static tanger.med.core.model.TMessage getTMessage(long messageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTMessage(messageId);
	}

	/**
	* Returns the t message matching the UUID and group.
	*
	* @param uuid the t message's UUID
	* @param groupId the primary key of the group
	* @return the matching t message
	* @throws PortalException if a matching t message could not be found
	*/
	public static tanger.med.core.model.TMessage getTMessageByUuidAndGroupId(
		String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getTMessageByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<tanger.med.core.model.TMessage> getTMessages(
		int start, int end) {
		return getService().getTMessages(start, end);
	}

	/**
	* Returns all the t messages matching the UUID and company.
	*
	* @param uuid the UUID of the t messages
	* @param companyId the primary key of the company
	* @return the matching t messages, or an empty list if no matches were found
	*/
	public static java.util.List<tanger.med.core.model.TMessage> getTMessagesByUuidAndCompanyId(
		String uuid, long companyId) {
		return getService().getTMessagesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<tanger.med.core.model.TMessage> getTMessagesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<tanger.med.core.model.TMessage> orderByComparator) {
		return getService()
				   .getTMessagesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of t messages.
	*
	* @return the number of t messages
	*/
	public static int getTMessagesCount() {
		return getService().getTMessagesCount();
	}

	/**
	* Updates the t message in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param tMessage the t message
	* @return the t message that was updated
	*/
	public static tanger.med.core.model.TMessage updateTMessage(
		tanger.med.core.model.TMessage tMessage) {
		return getService().updateTMessage(tMessage);
	}

	public static TMessageLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<TMessageLocalService, TMessageLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(TMessageLocalService.class);

		ServiceTracker<TMessageLocalService, TMessageLocalService> serviceTracker =
			new ServiceTracker<TMessageLocalService, TMessageLocalService>(bundle.getBundleContext(),
				TMessageLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}
}