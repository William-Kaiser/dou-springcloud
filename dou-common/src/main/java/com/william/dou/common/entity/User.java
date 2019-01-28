package com.william.dou.common.entity;


import java.io.Serializable;
import java.util.List;

/**
 * @author likai
 */
public class User implements Serializable {

    private Integer userId;
    /**
     *   用户姓名
     */
    private String userName;
    /**
     *   密码
     */
    private String password;

    /**
     *   一个用户具有多个角色
     */
    private List<Role> roleList;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }
}

