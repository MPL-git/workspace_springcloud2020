package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-07-03 上午 10:12
 */
@EnableDiscoveryClient
@SpringBootApplication
public class OrderNacosMain83 {

	public static void main(String[] args) {
		SpringApplication.run(OrderNacosMain83.class, args);
	}

}
