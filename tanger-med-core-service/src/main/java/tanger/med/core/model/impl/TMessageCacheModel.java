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

package tanger.med.core.model.impl;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import tanger.med.core.model.TMessage;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TMessage in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @see TMessage
 * @generated
 */
@ProviderType
public class TMessageCacheModel implements CacheModel<TMessage>, Externalizable {
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof TMessageCacheModel)) {
			return false;
		}

		TMessageCacheModel tMessageCacheModel = (TMessageCacheModel)obj;

		if (messageId == tMessageCacheModel.messageId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, messageId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", messageId=");
		sb.append(messageId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", title=");
		sb.append(title);
		sb.append(", content=");
		sb.append(content);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TMessage toEntityModel() {
		TMessageImpl tMessageImpl = new TMessageImpl();

		if (uuid == null) {
			tMessageImpl.setUuid("");
		}
		else {
			tMessageImpl.setUuid(uuid);
		}

		tMessageImpl.setMessageId(messageId);
		tMessageImpl.setGroupId(groupId);
		tMessageImpl.setCompanyId(companyId);
		tMessageImpl.setUserId(userId);

		if (title == null) {
			tMessageImpl.setTitle("");
		}
		else {
			tMessageImpl.setTitle(title);
		}

		if (content == null) {
			tMessageImpl.setContent("");
		}
		else {
			tMessageImpl.setContent(content);
		}

		if (createDate == Long.MIN_VALUE) {
			tMessageImpl.setCreateDate(null);
		}
		else {
			tMessageImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			tMessageImpl.setModifiedDate(null);
		}
		else {
			tMessageImpl.setModifiedDate(new Date(modifiedDate));
		}

		tMessageImpl.resetOriginalValues();

		return tMessageImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		messageId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		title = objectInput.readUTF();
		content = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(messageId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (title == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(title);
		}

		if (content == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(content);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
	}

	public String uuid;
	public long messageId;
	public long groupId;
	public long companyId;
	public long userId;
	public String title;
	public String content;
	public long createDate;
	public long modifiedDate;
}