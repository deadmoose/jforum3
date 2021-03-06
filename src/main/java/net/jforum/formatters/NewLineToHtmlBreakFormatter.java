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
package net.jforum.formatters;

import org.apache.commons.lang.StringUtils;

/**
 * Convertes each \n to &lt;br&gt;
 * @author Rafael Steil
 */
public class NewLineToHtmlBreakFormatter implements Formatter {
	/**
	 * @see net.jforum.formatters.Formatter#format(String, PostOptions)
	 */
	public String format(String text, PostOptions postOptions) {
		return StringUtils.replace(text, "\n", "<br/> ");
	}
}
