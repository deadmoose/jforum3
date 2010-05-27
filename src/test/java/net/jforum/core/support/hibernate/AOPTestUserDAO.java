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
package net.jforum.core.support.hibernate;

import java.util.List;

import net.jforum.core.hibernate.HibernateGenericDAO;
import net.jforum.entities.Group;
import net.jforum.entities.User;
import net.jforum.entities.Post;
import net.jforum.entities.Topic;
import net.jforum.repository.UserRepository;

import org.hibernate.SessionFactory;

/**
 * @author Rafael Steil
 */
public class AOPTestUserDAO extends HibernateGenericDAO<User> implements UserRepository {

	public AOPTestUserDAO(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	/**
	 * @see net.jforum.repository.UserRepository#findByUserName(String)
	 */
	public List<User> findByUserName(String username) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getAllUsers(int, int)
	 */
	public List<User> getAllUsers(int start, int count) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getByUsername(String)
	 */
	public User getByUsername(String username) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getLastRegisteredUser()
	 */
	public User getLastRegisteredUser() {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getTotalPosts(net.jforum.entities.User)
	 */
	public int getTotalPosts(User user) {
		return 0;
	}

    /**
     * @see net.jforum.repository.UserRepository#getTotalTopics(int)
     */
    public int getTotalTopics(int userId) {
        return 0;
    }

    /**
	 * @see net.jforum.repository.UserRepository#getTotalUsers()
	 */
	public int getTotalUsers() {
		return 0;
	}

	/**
	 * @see net.jforum.repository.UserRepository#validateLogin(String, String)
	 */
	public User validateLogin(String username, String password) {
		return null;
	}

	/**
	 * @see net.jforum.repository.Repository#add(Object)
	 */
	@Override
	public void add(User entity) {
	}

	/**
	 * @see net.jforum.repository.Repository#get(int)
	 */
	@Override
	public User get(int id) {
		return null;
	}

	/**
	 * @see net.jforum.repository.Repository#remove(Object)
	 */
	@Override
	public void remove(User entity) {
	}

	/**
	 * @see net.jforum.repository.Repository#update(Object)
	 */
	@Override
	public void update(User entity) {
	}

	/**
	 * @see net.jforum.repository.UserRepository#getTotalUnreadPrivateMessages(net.jforum.entities.User)
	 */
	public int getTotalUnreadPrivateMessages(User user) {
		return 0;
	}

	/**
	 * @see net.jforum.repository.UserRepository#isUsernameAvailable(String, String)
	 */
	public boolean isUsernameAvailable(String username, String email) {
		return false;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getByEmail(String)
	 */
	public User getByEmail(String email) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#validateLostPasswordHash(String, String)
	 */
	public User validateLostPasswordHash(String username, String hash) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#getAllUsers(int, int, java.util.List)
	 */
	public List<User> getAllUsers(int start, int count, List<Group> filterGroups) {
		return null;
	}

	/**
	 * @see net.jforum.repository.UserRepository#findByUserName(String, java.util.List)
	 */
	public List<User> findByUserName(String username, List<Group> filterGroups) {
		return null;
	}

    /**
     * @see net.jforum.repository.UserRepository#getPosts(net.jforum.entities.User, int, int)
     */
    public List<Post> getPosts(User user, int start, int recordsPerPage) {
        return null;
    }

    /**
     * @see net.jforum.repository.UserRepository#getTopics(net.jforum.entities.User, int, int)
     */
    public List<Topic> getTopics(User user, int start, int recordsPerPage) {
        return null;
    }

    /**
	 * @see net.jforum.repository.UserRepository#changeAllowAvatarState(boolean, net.jforum.entities.Group)
	 */
	public void changeAllowAvatarState(boolean allowAvatar, Group group) {
	}

}
