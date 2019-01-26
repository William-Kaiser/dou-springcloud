package com.william.dou.douauth.controller;

import com.william.dou.douauth.entity.UserVo;
import com.william.dou.douauth.feign.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/current", method = RequestMethod.GET)
    public Principal getUser(Principal principal) {
        logger.info(principal.toString());
        return principal;
    }

    @RequestMapping(value = "/demo", method = RequestMethod.GET)
    public String demo() {
        UserVo voUser = userService.findUserByUsername("ssm");
        logger.info("voUser="+voUser);
        return voUser.getUsername();
    }
}
