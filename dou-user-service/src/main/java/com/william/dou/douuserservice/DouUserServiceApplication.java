package com.william.dou.douuserservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
//@ComponentScan(basePackages = {"com.william.dou.douuserservice.base"})
@MapperScan("com.william.dou.douuserservice.mapper")
public class DouUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouUserServiceApplication.class, args);
	}
}
