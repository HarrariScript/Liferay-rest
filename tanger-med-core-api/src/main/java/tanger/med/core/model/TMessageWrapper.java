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

package tanger.med.core.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.exportimport.kernel.lar.StagedModelType;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link TMessage}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TMessage
 * @generated
 */
@ProviderType
public class TMessageWrapper implements TMessage, ModelWrapper<TMessage> {
	public TMessageWrapper(TMessage tMessage) {
		_tMessage = tMessage;
	}

	@Override
	public Class<?> getModelClass() {
		return TMessage.class;
	}

	@Override
	public String getModelClassName() {
		return TMessage.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("messageId", getMessageId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("title", getTitle());
		attributes.put("content", getContent());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long messageId = (Long)attributes.get("messageId");

		if (messageId != null) {
			setMessageId(messageId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String title = (String)attributes.get("title");

		if (title != null) {
			setTitle(title);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}
	}

	@Override
	public Object clone() {
		return new TMessageWrapper((TMessage)_tMessage.clone());
	}

	@Override
	public int compareTo(TMessage tMessage) {
		return _tMessage.compareTo(tMessage);
	}

	/**
	* Returns the company ID of this t message.
	*
	* @return the company ID of this t message
	*/
	@Override
	public long getCompanyId() {
		return _tMessage.getCompanyId();
	}

	/**
	* Returns the content of this t message.
	*
	* @return the content of this t message
	*/
	@Override
	public String getContent() {
		return _tMessage.getContent();
	}

	/**
	* Returns the create date of this t message.
	*
	* @return the create date of this t message
	*/
	@Override
	public Date getCreateDate() {
		return _tMessage.getCreateDate();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _tMessage.getExpandoBridge();
	}

	/**
	* Returns the group ID of this t message.
	*
	* @return the group ID of this t message
	*/
	@Override
	public long getGroupId() {
		return _tMessage.getGroupId();
	}

	/**
	* Returns the message ID of this t message.
	*
	* @return the message ID of this t message
	*/
	@Override
	public long getMessageId() {
		return _tMessage.getMessageId();
	}

	/**
	* Returns the modified date of this t message.
	*
	* @return the modified date of this t message
	*/
	@Override
	public Date getModifiedDate() {
		return _tMessage.getModifiedDate();
	}

	/**
	* Returns the primary key of this t message.
	*
	* @return the primary key of this t message
	*/
	@Override
	public long getPrimaryKey() {
		return _tMessage.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tMessage.getPrimaryKeyObj();
	}

	/**
	* Returns the title of this t message.
	*
	* @return the title of this t message
	*/
	@Override
	public String getTitle() {
		return _tMessage.getTitle();
	}

	/**
	* Returns the user ID of this t message.
	*
	* @return the user ID of this t message
	*/
	@Override
	public long getUserId() {
		return _tMessage.getUserId();
	}

	/**
	* Returns the user uuid of this t message.
	*
	* @return the user uuid of this t message
	*/
	@Override
	public String getUserUuid() {
		return _tMessage.getUserUuid();
	}

	/**
	* Returns the uuid of this t message.
	*
	* @return the uuid of this t message
	*/
	@Override
	public String getUuid() {
		return _tMessage.getUuid();
	}

	@Override
	public int hashCode() {
		return _tMessage.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _tMessage.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _tMessage.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _tMessage.isNew();
	}

	@Override
	public void persist() {
		_tMessage.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_tMessage.setCachedModel(cachedModel);
	}

	/**
	* Sets the company ID of this t message.
	*
	* @param companyId the company ID of this t message
	*/
	@Override
	public void setCompanyId(long companyId) {
		_tMessage.setCompanyId(companyId);
	}

	/**
	* Sets the content of this t message.
	*
	* @param content the content of this t message
	*/
	@Override
	public void setContent(String content) {
		_tMessage.setContent(content);
	}

	/**
	* Sets the create date of this t message.
	*
	* @param createDate the create date of this t message
	*/
	@Override
	public void setCreateDate(Date createDate) {
		_tMessage.setCreateDate(createDate);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_tMessage.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_tMessage.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_tMessage.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the group ID of this t message.
	*
	* @param groupId the group ID of this t message
	*/
	@Override
	public void setGroupId(long groupId) {
		_tMessage.setGroupId(groupId);
	}

	/**
	* Sets the message ID of this t message.
	*
	* @param messageId the message ID of this t message
	*/
	@Override
	public void setMessageId(long messageId) {
		_tMessage.setMessageId(messageId);
	}

	/**
	* Sets the modified date of this t message.
	*
	* @param modifiedDate the modified date of this t message
	*/
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_tMessage.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_tMessage.setNew(n);
	}

	/**
	* Sets the primary key of this t message.
	*
	* @param primaryKey the primary key of this t message
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_tMessage.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_tMessage.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the title of this t message.
	*
	* @param title the title of this t message
	*/
	@Override
	public void setTitle(String title) {
		_tMessage.setTitle(title);
	}

	/**
	* Sets the user ID of this t message.
	*
	* @param userId the user ID of this t message
	*/
	@Override
	public void setUserId(long userId) {
		_tMessage.setUserId(userId);
	}

	/**
	* Sets the user uuid of this t message.
	*
	* @param userUuid the user uuid of this t message
	*/
	@Override
	public void setUserUuid(String userUuid) {
		_tMessage.setUserUuid(userUuid);
	}

	/**
	* Sets the uuid of this t message.
	*
	* @param uuid the uuid of this t message
	*/
	@Override
	public void setUuid(String uuid) {
		_tMessage.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<TMessage> toCacheModel() {
		return _tMessage.toCacheModel();
	}

	@Override
	public TMessage toEscapedModel() {
		return new TMessageWrapper(_tMessage.toEscapedModel());
	}

	@Override
	public String toString() {
		return _tMessage.toString();
	}

	@Override
	public TMessage toUnescapedModel() {
		return new TMessageWrapper(_tMessage.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _tMessage.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TMessageWrapper)) {
			return false;
		}

		TMessageWrapper tMessageWrapper = (TMessageWrapper)obj;

		if (Objects.equals(_tMessage, tMessageWrapper._tMessage)) {
			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _tMessage.getStagedModelType();
	}

	@Override
	public TMessage getWrappedModel() {
		return _tMessage;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _tMessage.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _tMessage.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_tMessage.resetOriginalValues();
	}

	private final TMessage _tMessage;
}