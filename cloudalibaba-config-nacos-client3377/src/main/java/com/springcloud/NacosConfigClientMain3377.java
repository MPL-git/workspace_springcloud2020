package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-07-03 上午 11:09
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosConfigClientMain3377 {

	public static void main(String[] args) {
		SpringApplication.run(NacosConfigClientMain3377.class, args);
	}

}
