/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.service;


import com.william.dou.common.entity.User;

/**
 * @author liankai
 */
public interface UserService {

	User selectRolesAndPermsByName(String name);

}