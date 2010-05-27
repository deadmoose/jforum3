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
package net.jforum.events;

import net.jforum.entities.Topic;

/**
 * Default implementation of an {@link Event}, for {@link Topic}.
 * All methods are empty, as it is destined to be
 * extended by classes that only want to handle
 * one or another event
 * @author Rafael Steil
 */
public class EmptyTopicEvent implements Event<Topic> {

	/**
	 * @see net.jforum.events.Event#added(Object)
	 */
	public void added(Topic entity) {
	}

	/**
	 * @see net.jforum.events.Event#deleted(Object)
	 */
	public void deleted(Topic entity) {
	}

	/**
	 * @see net.jforum.events.Event#updated(Object)
	 */
	public void updated(Topic entity) {
	}

	/**
	 * @see net.jforum.events.Event#beforeAdd(Object)
	 */
	public void beforeAdd(Topic entity) {
	}

	/**
	 * @see net.jforum.events.Event#beforeDeleted(Object)
	 */
	public void beforeDeleted(Topic entity) {
	}

	/**
	 * @see net.jforum.events.Event#beforeUpdated(Object)
	 */
	public void beforeUpdated(Topic entity) {
	}
}
