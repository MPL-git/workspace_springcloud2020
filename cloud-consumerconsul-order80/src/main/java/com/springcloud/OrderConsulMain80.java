package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-06-29 下午 2:28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderConsulMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderConsulMain80.class, args);
	}

}
