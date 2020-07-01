package com.springcloud.controller;

import com.springcloud.service.IMessageProvider;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Pengl
 * @create 2020-07-01 下午 5:44
 */
@RestController
public class SendMessageController {

	@Resource
	private IMessageProvider messageProvider;

	@GetMapping(value = "/sendMessage")
	public String sendMessage() {
		return messageProvider.send();
	}


}
