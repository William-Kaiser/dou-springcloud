package com.william.dou.douauth.entity;

import org.springframework.security.core.GrantedAuthority;

import java.util.List;

public class RoleVo implements GrantedAuthority {

    private Integer id;

    private String roleName;
    /**
     *一个角色对应多个用户
     */
    private List<UserVo> userList;

    @Override
    public String getAuthority() {
        return roleName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<UserVo> getUserList() {
        return userList;
    }

    public void setUserList(List<UserVo> userList) {
        this.userList = userList;
    }
}
