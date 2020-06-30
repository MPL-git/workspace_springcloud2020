package com.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @author Pengl
 * @create 2020-06-30 上午 11:20
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService {
	@Override
	public String paymentInfo_OK(Integer id) {
		return "-----PaymentFallbackService fall back paymentInfo_OK,o(╥﹏╥)o";
	}

	@Override
	public String paymentInfo_Timeout(Integer id) {
		return "-----PaymentFallbackService fall back paymentInfo_Timeout,o(╥﹏╥)o";
	}
}
