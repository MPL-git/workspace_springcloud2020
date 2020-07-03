package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Pengl
 * @create 2020-07-03 上午 9:57
 */
@EnableDiscoveryClient
@SpringBootApplication
public class PaymentMain9002 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMain9002.class, args);
	}

}
