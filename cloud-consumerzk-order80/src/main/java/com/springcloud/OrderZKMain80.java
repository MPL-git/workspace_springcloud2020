package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-06-29 上午 11:07
 */
@SpringBootApplication
@EnableDiscoveryClient
public class OrderZKMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderZKMain80.class, args);
	}

}
