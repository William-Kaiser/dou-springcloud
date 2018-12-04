package com.william.dou.douauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

@EnableDiscoveryClient
@EnableResourceServer
@EnableFeignClients
@SpringBootApplication
public class DouAuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouAuthApplication.class, args);
	}
}
