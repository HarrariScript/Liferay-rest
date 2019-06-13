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

package tanger.med.core.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tanger.med.core.exception.NoSuchTMessageException;
import tanger.med.core.model.TMessage;

/**
 * The persistence interface for the t message service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tanger.med.core.service.persistence.impl.TMessagePersistenceImpl
 * @see TMessageUtil
 * @generated
 */
@ProviderType
public interface TMessagePersistence extends BasePersistence<TMessage> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link TMessageUtil} to access the t message persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the t messages where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the matching t messages
	*/
	public java.util.List<TMessage> findByUuid(String uuid);

	/**
	* Returns a range of all the t messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @return the range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid(String uuid, int start, int end);

	/**
	* Returns an ordered range of all the t messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns an ordered range of all the t messages where uuid = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid(String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first t message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t message
	* @throws NoSuchTMessageException if a matching t message could not be found
	*/
	public TMessage findByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Returns the first t message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUuid_First(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns the last t message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t message
	* @throws NoSuchTMessageException if a matching t message could not be found
	*/
	public TMessage findByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Returns the last t message in the ordered set where uuid = &#63;.
	*
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUuid_Last(String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns the t messages before and after the current t message in the ordered set where uuid = &#63;.
	*
	* @param messageId the primary key of the current t message
	* @param uuid the uuid
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t message
	* @throws NoSuchTMessageException if a t message with the primary key could not be found
	*/
	public TMessage[] findByUuid_PrevAndNext(long messageId, String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Removes all the t messages where uuid = &#63; from the database.
	*
	* @param uuid the uuid
	*/
	public void removeByUuid(String uuid);

	/**
	* Returns the number of t messages where uuid = &#63;.
	*
	* @param uuid the uuid
	* @return the number of matching t messages
	*/
	public int countByUuid(String uuid);

	/**
	* Returns the t message where uuid = &#63; and groupId = &#63; or throws a {@link NoSuchTMessageException} if it could not be found.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching t message
	* @throws NoSuchTMessageException if a matching t message could not be found
	*/
	public TMessage findByUUID_G(String uuid, long groupId)
		throws NoSuchTMessageException;

	/**
	* Returns the t message where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUUID_G(String uuid, long groupId);

	/**
	* Returns the t message where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUUID_G(String uuid, long groupId,
		boolean retrieveFromCache);

	/**
	* Removes the t message where uuid = &#63; and groupId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the t message that was removed
	*/
	public TMessage removeByUUID_G(String uuid, long groupId)
		throws NoSuchTMessageException;

	/**
	* Returns the number of t messages where uuid = &#63; and groupId = &#63;.
	*
	* @param uuid the uuid
	* @param groupId the group ID
	* @return the number of matching t messages
	*/
	public int countByUUID_G(String uuid, long groupId);

	/**
	* Returns all the t messages where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the matching t messages
	*/
	public java.util.List<TMessage> findByUuid_C(String uuid, long companyId);

	/**
	* Returns a range of all the t messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @return the range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid_C(String uuid, long companyId,
		int start, int end);

	/**
	* Returns an ordered range of all the t messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns an ordered range of all the t messages where uuid = &#63; and companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of matching t messages
	*/
	public java.util.List<TMessage> findByUuid_C(String uuid, long companyId,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Returns the first t message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t message
	* @throws NoSuchTMessageException if a matching t message could not be found
	*/
	public TMessage findByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Returns the first t message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUuid_C_First(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns the last t message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t message
	* @throws NoSuchTMessageException if a matching t message could not be found
	*/
	public TMessage findByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Returns the last t message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching t message, or <code>null</code> if a matching t message could not be found
	*/
	public TMessage fetchByUuid_C_Last(String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns the t messages before and after the current t message in the ordered set where uuid = &#63; and companyId = &#63;.
	*
	* @param messageId the primary key of the current t message
	* @param uuid the uuid
	* @param companyId the company ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next t message
	* @throws NoSuchTMessageException if a t message with the primary key could not be found
	*/
	public TMessage[] findByUuid_C_PrevAndNext(long messageId, String uuid,
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator)
		throws NoSuchTMessageException;

	/**
	* Removes all the t messages where uuid = &#63; and companyId = &#63; from the database.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	*/
	public void removeByUuid_C(String uuid, long companyId);

	/**
	* Returns the number of t messages where uuid = &#63; and companyId = &#63;.
	*
	* @param uuid the uuid
	* @param companyId the company ID
	* @return the number of matching t messages
	*/
	public int countByUuid_C(String uuid, long companyId);

	/**
	* Caches the t message in the entity cache if it is enabled.
	*
	* @param tMessage the t message
	*/
	public void cacheResult(TMessage tMessage);

	/**
	* Caches the t messages in the entity cache if it is enabled.
	*
	* @param tMessages the t messages
	*/
	public void cacheResult(java.util.List<TMessage> tMessages);

	/**
	* Creates a new t message with the primary key. Does not add the t message to the database.
	*
	* @param messageId the primary key for the new t message
	* @return the new t message
	*/
	public TMessage create(long messageId);

	/**
	* Removes the t message with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param messageId the primary key of the t message
	* @return the t message that was removed
	* @throws NoSuchTMessageException if a t message with the primary key could not be found
	*/
	public TMessage remove(long messageId) throws NoSuchTMessageException;

	public TMessage updateImpl(TMessage tMessage);

	/**
	* Returns the t message with the primary key or throws a {@link NoSuchTMessageException} if it could not be found.
	*
	* @param messageId the primary key of the t message
	* @return the t message
	* @throws NoSuchTMessageException if a t message with the primary key could not be found
	*/
	public TMessage findByPrimaryKey(long messageId)
		throws NoSuchTMessageException;

	/**
	* Returns the t message with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param messageId the primary key of the t message
	* @return the t message, or <code>null</code> if a t message with the primary key could not be found
	*/
	public TMessage fetchByPrimaryKey(long messageId);

	@Override
	public java.util.Map<java.io.Serializable, TMessage> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the t messages.
	*
	* @return the t messages
	*/
	public java.util.List<TMessage> findAll();

	/**
	* Returns a range of all the t messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @return the range of t messages
	*/
	public java.util.List<TMessage> findAll(int start, int end);

	/**
	* Returns an ordered range of all the t messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of t messages
	*/
	public java.util.List<TMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator);

	/**
	* Returns an ordered range of all the t messages.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link TMessageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of t messages
	* @param end the upper bound of the range of t messages (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of t messages
	*/
	public java.util.List<TMessage> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<TMessage> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the t messages from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of t messages.
	*
	* @return the number of t messages
	*/
	public int countAll();

	@Override
	public java.util.Set<String> getBadColumnNames();
}