package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Pengl
 * @create 2020-06-30 下午 3:27
 */
@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class GateWayMain9527 {

	public static void main(String[] args) {
		SpringApplication.run(GateWayMain9527.class, args);
	}

}
