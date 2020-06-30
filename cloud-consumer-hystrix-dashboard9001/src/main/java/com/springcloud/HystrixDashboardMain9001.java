package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Pengl
 * @create 2020-06-30 下午 2:21
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboardMain9001 {

	public static void main(String[] args) {
		SpringApplication.run(HystrixDashboardMain9001.class, args);
	}

}
