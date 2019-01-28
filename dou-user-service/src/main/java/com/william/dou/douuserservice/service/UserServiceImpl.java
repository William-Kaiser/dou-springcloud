/**
 * Copyright &copy; 2015-2020 <a href="http://www.jeeplus.org/">JeePlus</a> All rights reserved.
 */
package com.william.dou.douuserservice.service;

import com.william.dou.common.entity.User;
import com.william.dou.douuserservice.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liankai
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
	private UserMapper userMapper;


	@Override
	public User selectRolesAndPermsByName(String name) {
		return userMapper.selectRolesAndPermsByName(name);
	}
}