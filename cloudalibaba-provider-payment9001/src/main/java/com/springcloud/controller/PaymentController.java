package com.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pengl
 * @create 2020-07-03 上午 9:49
 */
@RestController
public class PaymentController {

	@Value("${server.port}")
	private String serverPort;

	@GetMapping(value = "/payment/nacos/{id}")
	public String getPayment(@PathVariable("id") Integer id) {
		return "nacos registy, serverPort: "+ serverPort +"\t id"+ id;
	}

}
