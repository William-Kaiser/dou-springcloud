/*
 *    Copyright (c) 2018-2025, lengleng All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * Redistributions of source code must retain the above copyright notice,
 * this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 * notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * Neither the name of the pig4cloud.com developer nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 * Author: lengleng (wangiegie@gmail.com)
 */

package com.william.dou.douadmin.feign;

import com.william.dou.douadmin.config.FeignConfig;
import com.william.dou.douadmin.entity.User;
import com.william.dou.douadmin.feign.fallback.UserServiceFallbackImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author william
 */
@FeignClient(name = "dou-user-service", configuration = FeignConfig.class,fallback = UserServiceFallbackImpl.class)
public interface UserService {

    /**
     * 通过用户名查询用户及其角色信息
     *
     * @param  username 用户名
     * @return  User 对象
     */
    @GetMapping("/findUserByUsername/{username}")
    User findUserByUsername(@PathVariable(value = "username") String username);

}
