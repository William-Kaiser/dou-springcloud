package com.william.dou.douauth.dto;


import com.william.dou.douauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDao extends JpaRepository<User, Long> {
    User findByUsername(String username);

}
