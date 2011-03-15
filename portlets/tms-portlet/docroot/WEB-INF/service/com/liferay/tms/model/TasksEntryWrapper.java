/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
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

package com.liferay.tms.model;

/**
 * <p>
 * This class is a wrapper for {@link TasksEntry}.
 * </p>
 *
 * @author    Ryan Park
 * @see       TasksEntry
 * @generated
 */
public class TasksEntryWrapper implements TasksEntry {
	public TasksEntryWrapper(TasksEntry tasksEntry) {
		_tasksEntry = tasksEntry;
	}

	/**
	* Gets the primary key of this tasks entry.
	*
	* @return the primary key of this tasks entry
	*/
	public long getPrimaryKey() {
		return _tasksEntry.getPrimaryKey();
	}

	/**
	* Sets the primary key of this tasks entry
	*
	* @param pk the primary key of this tasks entry
	*/
	public void setPrimaryKey(long pk) {
		_tasksEntry.setPrimaryKey(pk);
	}

	/**
	* Gets the tasks entry ID of this tasks entry.
	*
	* @return the tasks entry ID of this tasks entry
	*/
	public long getTasksEntryId() {
		return _tasksEntry.getTasksEntryId();
	}

	/**
	* Sets the tasks entry ID of this tasks entry.
	*
	* @param tasksEntryId the tasks entry ID of this tasks entry
	*/
	public void setTasksEntryId(long tasksEntryId) {
		_tasksEntry.setTasksEntryId(tasksEntryId);
	}

	/**
	* Gets the group ID of this tasks entry.
	*
	* @return the group ID of this tasks entry
	*/
	public long getGroupId() {
		return _tasksEntry.getGroupId();
	}

	/**
	* Sets the group ID of this tasks entry.
	*
	* @param groupId the group ID of this tasks entry
	*/
	public void setGroupId(long groupId) {
		_tasksEntry.setGroupId(groupId);
	}

	/**
	* Gets the company ID of this tasks entry.
	*
	* @return the company ID of this tasks entry
	*/
	public long getCompanyId() {
		return _tasksEntry.getCompanyId();
	}

	/**
	* Sets the company ID of this tasks entry.
	*
	* @param companyId the company ID of this tasks entry
	*/
	public void setCompanyId(long companyId) {
		_tasksEntry.setCompanyId(companyId);
	}

	/**
	* Gets the user ID of this tasks entry.
	*
	* @return the user ID of this tasks entry
	*/
	public long getUserId() {
		return _tasksEntry.getUserId();
	}

	/**
	* Sets the user ID of this tasks entry.
	*
	* @param userId the user ID of this tasks entry
	*/
	public void setUserId(long userId) {
		_tasksEntry.setUserId(userId);
	}

	/**
	* Gets the user uuid of this tasks entry.
	*
	* @return the user uuid of this tasks entry
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tasksEntry.getUserUuid();
	}

	/**
	* Sets the user uuid of this tasks entry.
	*
	* @param userUuid the user uuid of this tasks entry
	*/
	public void setUserUuid(java.lang.String userUuid) {
		_tasksEntry.setUserUuid(userUuid);
	}

	/**
	* Gets the user name of this tasks entry.
	*
	* @return the user name of this tasks entry
	*/
	public java.lang.String getUserName() {
		return _tasksEntry.getUserName();
	}

	/**
	* Sets the user name of this tasks entry.
	*
	* @param userName the user name of this tasks entry
	*/
	public void setUserName(java.lang.String userName) {
		_tasksEntry.setUserName(userName);
	}

	/**
	* Gets the create date of this tasks entry.
	*
	* @return the create date of this tasks entry
	*/
	public java.util.Date getCreateDate() {
		return _tasksEntry.getCreateDate();
	}

	/**
	* Sets the create date of this tasks entry.
	*
	* @param createDate the create date of this tasks entry
	*/
	public void setCreateDate(java.util.Date createDate) {
		_tasksEntry.setCreateDate(createDate);
	}

	/**
	* Gets the modified date of this tasks entry.
	*
	* @return the modified date of this tasks entry
	*/
	public java.util.Date getModifiedDate() {
		return _tasksEntry.getModifiedDate();
	}

	/**
	* Sets the modified date of this tasks entry.
	*
	* @param modifiedDate the modified date of this tasks entry
	*/
	public void setModifiedDate(java.util.Date modifiedDate) {
		_tasksEntry.setModifiedDate(modifiedDate);
	}

	/**
	* Gets the title of this tasks entry.
	*
	* @return the title of this tasks entry
	*/
	public java.lang.String getTitle() {
		return _tasksEntry.getTitle();
	}

	/**
	* Sets the title of this tasks entry.
	*
	* @param title the title of this tasks entry
	*/
	public void setTitle(java.lang.String title) {
		_tasksEntry.setTitle(title);
	}

	/**
	* Gets the priority of this tasks entry.
	*
	* @return the priority of this tasks entry
	*/
	public int getPriority() {
		return _tasksEntry.getPriority();
	}

	/**
	* Sets the priority of this tasks entry.
	*
	* @param priority the priority of this tasks entry
	*/
	public void setPriority(int priority) {
		_tasksEntry.setPriority(priority);
	}

	/**
	* Gets the assignee user ID of this tasks entry.
	*
	* @return the assignee user ID of this tasks entry
	*/
	public long getAssigneeUserId() {
		return _tasksEntry.getAssigneeUserId();
	}

	/**
	* Sets the assignee user ID of this tasks entry.
	*
	* @param assigneeUserId the assignee user ID of this tasks entry
	*/
	public void setAssigneeUserId(long assigneeUserId) {
		_tasksEntry.setAssigneeUserId(assigneeUserId);
	}

	/**
	* Gets the assignee user uuid of this tasks entry.
	*
	* @return the assignee user uuid of this tasks entry
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getAssigneeUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tasksEntry.getAssigneeUserUuid();
	}

	/**
	* Sets the assignee user uuid of this tasks entry.
	*
	* @param assigneeUserUuid the assignee user uuid of this tasks entry
	*/
	public void setAssigneeUserUuid(java.lang.String assigneeUserUuid) {
		_tasksEntry.setAssigneeUserUuid(assigneeUserUuid);
	}

	/**
	* Gets the resolver user ID of this tasks entry.
	*
	* @return the resolver user ID of this tasks entry
	*/
	public long getResolverUserId() {
		return _tasksEntry.getResolverUserId();
	}

	/**
	* Sets the resolver user ID of this tasks entry.
	*
	* @param resolverUserId the resolver user ID of this tasks entry
	*/
	public void setResolverUserId(long resolverUserId) {
		_tasksEntry.setResolverUserId(resolverUserId);
	}

	/**
	* Gets the resolver user uuid of this tasks entry.
	*
	* @return the resolver user uuid of this tasks entry
	* @throws SystemException if a system exception occurred
	*/
	public java.lang.String getResolverUserUuid()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _tasksEntry.getResolverUserUuid();
	}

	/**
	* Sets the resolver user uuid of this tasks entry.
	*
	* @param resolverUserUuid the resolver user uuid of this tasks entry
	*/
	public void setResolverUserUuid(java.lang.String resolverUserUuid) {
		_tasksEntry.setResolverUserUuid(resolverUserUuid);
	}

	/**
	* Gets the due date of this tasks entry.
	*
	* @return the due date of this tasks entry
	*/
	public java.util.Date getDueDate() {
		return _tasksEntry.getDueDate();
	}

	/**
	* Sets the due date of this tasks entry.
	*
	* @param dueDate the due date of this tasks entry
	*/
	public void setDueDate(java.util.Date dueDate) {
		_tasksEntry.setDueDate(dueDate);
	}

	/**
	* Gets the finish date of this tasks entry.
	*
	* @return the finish date of this tasks entry
	*/
	public java.util.Date getFinishDate() {
		return _tasksEntry.getFinishDate();
	}

	/**
	* Sets the finish date of this tasks entry.
	*
	* @param finishDate the finish date of this tasks entry
	*/
	public void setFinishDate(java.util.Date finishDate) {
		_tasksEntry.setFinishDate(finishDate);
	}

	/**
	* Gets the status of this tasks entry.
	*
	* @return the status of this tasks entry
	*/
	public int getStatus() {
		return _tasksEntry.getStatus();
	}

	/**
	* Sets the status of this tasks entry.
	*
	* @param status the status of this tasks entry
	*/
	public void setStatus(int status) {
		_tasksEntry.setStatus(status);
	}

	public boolean isNew() {
		return _tasksEntry.isNew();
	}

	public void setNew(boolean n) {
		_tasksEntry.setNew(n);
	}

	public boolean isCachedModel() {
		return _tasksEntry.isCachedModel();
	}

	public void setCachedModel(boolean cachedModel) {
		_tasksEntry.setCachedModel(cachedModel);
	}

	public boolean isEscapedModel() {
		return _tasksEntry.isEscapedModel();
	}

	public void setEscapedModel(boolean escapedModel) {
		_tasksEntry.setEscapedModel(escapedModel);
	}

	public java.io.Serializable getPrimaryKeyObj() {
		return _tasksEntry.getPrimaryKeyObj();
	}

	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _tasksEntry.getExpandoBridge();
	}

	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_tasksEntry.setExpandoBridgeAttributes(serviceContext);
	}

	public java.lang.Object clone() {
		return new TasksEntryWrapper((TasksEntry)_tasksEntry.clone());
	}

	public int compareTo(com.liferay.tms.model.TasksEntry tasksEntry) {
		return _tasksEntry.compareTo(tasksEntry);
	}

	public int hashCode() {
		return _tasksEntry.hashCode();
	}

	public com.liferay.tms.model.TasksEntry toEscapedModel() {
		return new TasksEntryWrapper(_tasksEntry.toEscapedModel());
	}

	public java.lang.String toString() {
		return _tasksEntry.toString();
	}

	public java.lang.String toXmlString() {
		return _tasksEntry.toXmlString();
	}

	public java.lang.String getAssigneeFullName() {
		return _tasksEntry.getAssigneeFullName();
	}

	public java.lang.String getPriorityLabel() {
		return _tasksEntry.getPriorityLabel();
	}

	public java.lang.String getReporterFullName() {
		return _tasksEntry.getReporterFullName();
	}

	public java.lang.String getStatusLabel() {
		return _tasksEntry.getStatusLabel();
	}

	public TasksEntry getWrappedTasksEntry() {
		return _tasksEntry;
	}

	private TasksEntry _tasksEntry;
}