package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author Pengl
 * @create 2020-06-22 上午 11:44
 */
@EnableEurekaClient
@SpringBootApplication
public class PaymentMain8002 {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMain8002.class, args);
	}

}
