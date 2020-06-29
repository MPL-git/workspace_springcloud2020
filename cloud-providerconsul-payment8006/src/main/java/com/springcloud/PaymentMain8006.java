package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-06-29 下午 1:48
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8006.class, args);
	}

}
