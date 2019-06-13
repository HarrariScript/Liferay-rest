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

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the TMessage service. Represents a row in the &quot;tangermed_TMessage&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see TMessageModel
 * @see tanger.med.core.model.impl.TMessageImpl
 * @see tanger.med.core.model.impl.TMessageModelImpl
 * @generated
 */
@ImplementationClassName("tanger.med.core.model.impl.TMessageImpl")
@ProviderType
public interface TMessage extends TMessageModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link tanger.med.core.model.impl.TMessageImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<TMessage, Long> MESSAGE_ID_ACCESSOR = new Accessor<TMessage, Long>() {
			@Override
			public Long get(TMessage tMessage) {
				return tMessage.getMessageId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<TMessage> getTypeClass() {
				return TMessage.class;
			}
		};
}