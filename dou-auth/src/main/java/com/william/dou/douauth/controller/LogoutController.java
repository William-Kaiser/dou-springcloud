package com.william.dou.douauth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LogoutController {
    @Autowired
    private ConsumerTokenServices consumerTokenServices;

    @DeleteMapping(value = "/exit")
    @ResponseBody
    public  String  revokeToken(String access_token){
        if (consumerTokenServices.revokeToken(access_token)){
            return "注销成功";
        }else {

            return "注销失败";
        }
    }
}
