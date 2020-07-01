package com.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Pengl
 * @create 2020-07-01 上午 10:26
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigCenterMain3344 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigCenterMain3344.class, args);
	}

}
