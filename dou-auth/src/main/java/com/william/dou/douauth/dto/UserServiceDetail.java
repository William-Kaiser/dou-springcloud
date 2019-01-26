package com.william.dou.douauth.dto;

import com.william.dou.douauth.feign.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserServiceDetail  implements UserDetailsService {

//    @Autowired
//    private UserDao userRepository;

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        return userRepository.findByUsername(username);
        UserDetails userDetails = userService.findUserByUsername(username);
        return userService.findUserByUsername(username);
    }
}
