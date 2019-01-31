package com.william.dou.douadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrix
//@EnableHystrixDashboard
//@EnableTurbine
//@EnableZipkinServer
@SpringBootApplication
public class DouAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DouAdminApplication.class, args);
	}

//	@Bean
//	public ServletRegistrationBean getServlet() {
//		HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
//		ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
//		registrationBean.setLoadOnStartup(1);
//		registrationBean.addUrlMappings("/hystrix.stream");
//		registrationBean.setName("HystrixMetricsStreamServlet");
//		return registrationBean;
//	}
}
