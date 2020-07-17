package com.springcloud.controller;

import com.springcloud.domain.CommonResult;
import com.springcloud.domain.Order;
import com.springcloud.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:33
 */
@RestController
public class OrderController {

	@Resource
	private OrderService orderService;


	@GetMapping("/order/create")
	public CommonResult create(Order order)
	{
		orderService.create(order);
		return new CommonResult(200,"订单创建成功");
	}



}
