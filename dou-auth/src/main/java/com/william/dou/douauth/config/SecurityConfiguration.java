package com.william.dou.douauth.config;

import com.william.dou.douauth.dto.UserServiceDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


/**
 * 配置spring security
 * @author lk
 * 通过＠EnableWebSecurity 注解开启 Web 资源的保护功能。在 configure
    ( HttpSecurity http ）方法中配置所有的请求都需要验证，如果请求验证不通过，则重定位到 401
    界面。在 configure(AuthenticationManagerBuilder auth 方法中配置验证的用户信息源 密码
    策略。 IoC 容器 AuthenticationManager Bean Bean 0Auth2 的配
    中使用，因为只有在 OAuth2 中配置了 AuthenticationManager ，密码类型的验证才会开启
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private UserServiceDetail userServiceDetail;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userServiceDetail).passwordEncoder(new BCryptPasswordEncoder());
    }

    //配置了这个 Bean 才会开启密码类型的验证
    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        AuthenticationManager manager = super.authenticationManagerBean();
        return manager;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
//        http.requestMatchers().anyRequest()
//                .and()
//                .authorizeRequests()
//                .antMatchers("/oauth/**").permitAll();

        http.authorizeRequests().anyRequest().authenticated()
                .and()
                .csrf().disable();
    }
}
