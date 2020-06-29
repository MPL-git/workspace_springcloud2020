package com.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Pengl
 * @create 2020-06-29 下午 1:50
 */
@RestController
@Slf4j
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/consul")
	public String paymentConsul(){
		return "springcloud with consul: "+serverPort+"\t"+ UUID.randomUUID().toString();
	}

}
