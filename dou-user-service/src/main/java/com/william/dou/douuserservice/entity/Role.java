package com.william.dou.douuserservice.entity;


import java.io.Serializable;
import java.util.List;

/**
 * @author likai
 */
public class Role implements Serializable {

    private Integer id;

    private String roleName;
    /**
     *一个角色对应多个用户
     */
    private List<User> userList;

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


    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}

