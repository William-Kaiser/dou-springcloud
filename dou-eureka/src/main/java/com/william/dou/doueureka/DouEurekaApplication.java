package com.william.dou.doueureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DouEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouEurekaApplication.class, args);
	}
}
