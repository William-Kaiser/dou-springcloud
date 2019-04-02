package com.william.dou.douuserservice.controller;

import com.william.dou.common.entity.User;
import com.william.dou.douuserservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

import static java.lang.Thread.sleep;

/**
 * Created by SuperS on 2017/9/25.
 *
 * @author SuperS
 */
@RestController
public class UserController{

    @Autowired
    private UserService userService;

    @GetMapping("/current")
    public Principal user(Principal principal) {
        return principal;
    }

    @GetMapping("/query")
    public String query() {
        return "具有query权限";
    }

    /**
     * 通过用户名查询用户及其角色信息
     *
     * @param  username 用户名
     * @return  User 对象
     */
    @GetMapping("/findUserByUsername/{username}")
    public User findUserByUsername(@PathVariable String username) {
        return userService.selectRolesAndPermsByName(username);
    }

    /**
     * 测试用
     *
     */
    @GetMapping("/findUserName/{username}")
    public User findUserName(@PathVariable String username) {
        try {
            sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return userService.selectRolesAndPermsByName(username);
    }
}
