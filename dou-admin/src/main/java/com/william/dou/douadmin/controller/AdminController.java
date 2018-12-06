package com.william.dou.douadmin.controller;

import com.william.dou.douadmin.entity.User;
import com.william.dou.douadmin.feign.UserService;
import com.william.dou.doucommon.core.BaseController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * Created by SuperS on 2017/9/25.
 *
 * @author SuperS
 */
@RestController
public class AdminController extends BaseController {

    @Autowired
    private UserService userService;

    @GetMapping("/current")
    public Principal user(Principal principal) {
        if (notEmpty(principal)){
            System.out.println("notEmpty");
        }
        return principal;
    }

    @GetMapping("/findUserByUsername")
    @PreAuthorize("hasAnyAuthority('query')")
    public User query() {
        User user = userService.findUserByUsername("ssm");
        return user;
    }

    @GetMapping("/demo")
    public String demo() {
        return "demo";
    }
}
