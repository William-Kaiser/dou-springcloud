package com.william.dou.dougateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@EnableOAuth2Sso
public class DouGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouGatewayApplication.class, args);
	}
}
