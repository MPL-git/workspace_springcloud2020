package com.springcloud.service;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pengl
 * @create 2020-06-16 下午 5:16
 */
public interface PaymentService {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);

}
