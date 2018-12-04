/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;

import static org.apache.commons.lang.StringUtils.isNotBlank;
import static org.apache.http.util.TextUtils.isBlank;


/**
 * @author liankai
 */
public abstract class BaseController {

	/**
	 * 日志对象
	 */
	protected Logger logger = LoggerFactory.getLogger(getClass());

	public static boolean notEmpty(String var) {
		return isNotBlank(var);
	}

	public static boolean empty(String var) {
		return isBlank(var);
	}

	public static boolean notEmpty(Object var) {
		return null != var;
	}

	public static boolean empty(Object var) {
		return null == var;
	}

	public static boolean notEmpty(File file) {
		return null != file && file.exists();
	}

	public static boolean empty(File file) {
		return null == file || !file.exists();
	}

	public static boolean notEmpty(Object[] var) {
		return null != var && 0 < var.length;
	}

	public static boolean empty(Object[] var) {
		return null == var || 0 == var.length;
	}
	
	
}
