package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Pengl
 * @create 2020-06-22 上午 10:51
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7002 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7002.class, args);
	}

}
