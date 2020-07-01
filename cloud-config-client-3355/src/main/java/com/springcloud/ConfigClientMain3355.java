package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Pengl
 * @create 2020-07-01 上午 11:14
 */
@SpringBootApplication
@EnableEurekaClient
public class ConfigClientMain3355 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigClientMain3355.class, args);
	}

}
