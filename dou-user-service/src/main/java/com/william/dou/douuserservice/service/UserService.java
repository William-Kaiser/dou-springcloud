/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.service;

import com.william.dou.douuserservice.entity.User;

/**
 * @author liankai
 */
public interface UserService {

	public User selectRolesAndPermsByName(String name);

}