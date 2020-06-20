package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author Pengl
 * @create 2020-06-20 下午 5:33
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaMain7001 {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMain7001.class, args);
	}

}
