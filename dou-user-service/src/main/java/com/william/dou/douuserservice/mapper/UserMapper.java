package com.william.dou.douuserservice.mapper;

import com.william.dou.douuserservice.entity.User;

public interface UserMapper {

    User selectRolesAndPermsByName(String name);
}
