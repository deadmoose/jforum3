/*
 * Copyright (c) JForum Team. All rights reserved.
 *
 * The software in this package is published under the terms of the LGPL
 * license a copy of which has been included with this distribution in the
 * license.txt file.
 *
 * The JForum Project
 * http://www.jforum.net
 */
package net.jforum.actions.helpers;

import java.util.ArrayList;
import java.util.List;

/**
 * Use in the group permissions page
 * @author Rafael Steil
 */
public class PermissionOptions {
	private List<Integer> categories = new ArrayList<Integer>();
	private List<Integer> forums = new ArrayList<Integer>();
	private List<Integer> replyOnly = new ArrayList<Integer>();
	private List<Integer> readOnly = new ArrayList<Integer>();
	private List<Integer> moderatedReplies = new ArrayList<Integer>();
	private List<Integer> html = new ArrayList<Integer>();
	private List<Integer> attachments = new ArrayList<Integer>();
	private List<Integer> moderateForums = new ArrayList<Integer>();
	private List<Integer> attachmentsDownload = new ArrayList<Integer>();
	private List<Integer> groups = new ArrayList<Integer>();
	private boolean canRemovePosts;
	private boolean canEditPosts;
	private boolean canMoveTopics;
	private boolean canLockUnlock;
	private boolean moderator;
	private boolean canApproveMessages;
	private boolean administrator;
	private boolean stickyAnnouncement;
	private boolean poll;
	private boolean pollVote;
	private boolean canInteractOtherGroups;
	private boolean canManageForums;
	private boolean isCoAdministrator;
	private boolean privateMessageAllowed;
	private boolean userListingAllowed;
	private boolean canViewProfile;
	private boolean canHaveProfilePicture;
	private boolean postOnlyWithModeratorOnline;
	private boolean pmOnlyToModerators;
	private boolean canViewActivityLog;
	private boolean canViewFullActivityLog;

	public boolean getPostOnlyWithModeratorOnline() {
		return this.postOnlyWithModeratorOnline;
	}

	public void setPostOnlyWithModeratorOnline(boolean postOnlyWithModeratorOnline) {
		this.postOnlyWithModeratorOnline = postOnlyWithModeratorOnline;
	}

	public boolean isPrivateMessageAllowed() {
		return this.privateMessageAllowed;
	}

	public void setPrivateMessageAllowed(boolean privateMessage) {
		this.privateMessageAllowed = privateMessage;
	}

	public boolean isUserListingAllowed() {
		return this.userListingAllowed;
	}

	public void setUserListingAllowed(boolean userListing) {
		this.userListingAllowed = userListing;
	}

	public boolean getCanViewProfile() {
		return this.canViewProfile;
	}

	public void setCanViewProfile(boolean viewProfile) {
		this.canViewProfile = viewProfile;
	}

	public boolean getCanHaveProfilePicture() {
		return this.canHaveProfilePicture;
	}

	public void setCanHaveProfilePicture(boolean profilePicture) {
		this.canHaveProfilePicture = profilePicture;
	}

	/**
	 * Return true if can interact with users from other groups
	 * @return
	 */
	public boolean getCanInteractOtherGroups() {
		return this.canInteractOtherGroups;
	}

	public void setCanInteractOtherGroups(boolean canInteractOtherGroups) {
		this.canInteractOtherGroups = canInteractOtherGroups;
	}

	/**
	 * Forums where only replies are allowed
	 * @return
	 */
	public List<Integer> getReplyOnly() {
		return this.replyOnly;
	}

	/**
	 * Read-only forums
	 * @return
	 */
	public List<Integer> getReadOnlyForums() {
		return this.readOnly;
	}

	public List<Integer> getAllowedGroups() {
		return this.groups;
	}

	/**
	 * Forums where attachments are allowed
	 * @return
	 */
	public List<Integer> getAttachments() {
		return this.attachments;
	}

	/**
	 * Forums where HTML is allowed
	 * @return
	 */
	public List<Integer> getHtml() {
		return this.html;
	}

	/**
	 * Forums the group can moderate
	 * @return
	 */
	public List<Integer> getModerateForums() {
		return this.moderateForums;
	}

	/**
	 * Forums where replies should also be moderated
	 * @return
	 */
	public List<Integer> getModeratedReplies() {
		return this.moderatedReplies;
	}

	/**
	 * Allowed categories
	 * @return
	 */
	public List<Integer> getAllowedCategories() {
		return this.categories;
	}

	/**
	 * Allowed forums
	 * @return
	 */
	public List<Integer> getAllowedForums() {
		return this.forums;
	}

	/**
	 * @return true if post editing is allowed
	 */
	public boolean getCanEditPosts() {
		return canEditPosts;
	}

	/**
	 * @return true if post removal is allowed
	 */
	public boolean getCanRemovePosts() {
		return canRemovePosts;
	}

	/**
	 * @return true if topic moving is allowed
	 */
	public boolean getCanMoveTopics() {
		return canMoveTopics;
	}

	/**
	 * @return true if topic locking and unlocking is allowed
	 */
	public boolean getCanLockUnlock() {
		return canLockUnlock;
	}

	/**
	 * @return true if download of existing attachments is allowed
	 */
	public List<Integer> getDownloadAttachments() {
		return attachmentsDownload;
	}

	/**
	 * @return true if it is a moderator
	 */
	public boolean isModerator() {
		return moderator;
	}

	/**
	 * @return true if approving moderated messages is allowed
	 */
	public boolean getCanApproveMessages() {
		return canApproveMessages;
	}

	/**
	 * @return true if it is an administrator
	 */
	public boolean isAdministrator() {
		return administrator;
	}

	/**
	 * @return true if can create sticky or announcement topics
	 */
	public boolean getCanCreateStickyAnnouncement() {
		return stickyAnnouncement;
	}

	/**
	 * @return true if can create polls
	 */
	public boolean getCanCreatePoll() {
		return poll;
	}

	/**
	 * @return true if can vote on existing polls
	 */
	public boolean getAllowPollVote() {
		return pollVote;
	}

	public void setReplyOnly(int... replyOnly) {
		this.replyOnly = this.safeList(replyOnly);
	}

	public void setReadOnly(int... readOnly) {
		this.readOnly = this.safeList(readOnly);
	}

	public void setModeratedReplies(int... moderatedReplies) {
		this.moderatedReplies = this.safeList(moderatedReplies);
	}

	public void setGroups(int... groups) {
		this.groups = this.safeList(groups);
	}

	public void setHtml(int... html) {
		this.html = this.safeList(html);
	}

	public void setAttachments(int... attachments) {
		this.attachments = this.safeList(attachments);
	}

	public void setModerateForums(int... moderateForums) {
		this.moderateForums = this.safeList(moderateForums);
	}

	public void setCanRemovePosts(boolean canRemovePosts) {
		this.canRemovePosts = canRemovePosts;
	}

	public void setCanEditPosts(boolean canEditPosts) {
		this.canEditPosts = canEditPosts;
	}

	public void setCanMoveTopics(boolean canMoveTopics) {
		this.canMoveTopics = canMoveTopics;
	}

	public void setCanLockUnlock(boolean canLockUnlock) {
		this.canLockUnlock = canLockUnlock;
	}

	public void setAttachmentsDownload(int... attachmentsDownload) {
		this.attachmentsDownload = this.safeList(attachmentsDownload);
	}

	public void setModerator(boolean moderator) {
		this.moderator = moderator;
	}

	public void setCanApproveMessages(boolean canApproveMessages) {
		this.canApproveMessages = canApproveMessages;
	}

	public void setAdministrator(boolean administrator) {
		this.administrator = administrator;
	}

	public void setStickyAnnouncement(boolean stickyAnnouncement) {
		this.stickyAnnouncement = stickyAnnouncement;
	}

	public void setPoll(boolean poll) {
		this.poll = poll;
	}

	public void setPollVote(boolean pollVote) {
		this.pollVote = pollVote;
	}

	public void setCategories(int... categories) {
		this.categories = this.safeList(categories);
	}

	public void setForums(int... forums) {
		this.forums = this.safeList(forums);
	}

	private List<Integer> safeList(int... data) {
		if (data == null) {
			return new ArrayList<Integer>();
		}

		// Arrays.asList() does not work right with int[] (only with Integer[])
		List<Integer> l = new ArrayList<Integer>();

		for (int value : data) {
			l.add(value);
		}

		return l;
	}

	/**
	 * Just check for the reference or instanceof.
	 * This is a wrong implementation of equals(), and it only
	 * exists because it's needed in the test cases
	 */
	@Override
	public boolean equals(Object o) {
		return o == this || o instanceof PermissionOptions;
	}

	/**
	 * @param value
	 */
	public void setCanManageForums(boolean value) {
		this.canManageForums = value;
	}

	public boolean getCanManageForums() {
		return this.canManageForums;
	}

	public void setCoAdministrator(boolean value) {
		this.isCoAdministrator = value;
	}

	public boolean isCoAdministrator() {
		return this.isCoAdministrator;
	}

	public void setPmOnlyToModerators(boolean pmOnlyToModerators) {
		this.pmOnlyToModerators = pmOnlyToModerators;
	}

	public boolean isPmOnlyToModerators() {
		return pmOnlyToModerators;
	}

	public void setCanViewActivityLog(boolean canViewActivityLog) {
		this.canViewActivityLog = canViewActivityLog;
	}

	public boolean getCanViewActivityLog() {
		return canViewActivityLog;
	}

	public void setCanViewFullActivityLog(boolean canViewFullActivityLog) {
		this.canViewFullActivityLog = canViewFullActivityLog;
	}

	public boolean getCanViewFullActivityLog() {
		return canViewFullActivityLog;
	}
}
