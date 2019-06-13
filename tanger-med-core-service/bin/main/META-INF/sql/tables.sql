create table tangermed_TMessage (
	uuid_ VARCHAR(75) null,
	messageId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	title VARCHAR(75) null,
	content VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null
);