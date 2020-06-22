package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Pengl
 * @create 2020-06-20 下午 3:58
 */
@SpringBootApplication
@EnableEurekaClient
public class OrderMain80 {

	public static void main(String[] args) {
		SpringApplication.run(OrderMain80.class, args);
	}

}