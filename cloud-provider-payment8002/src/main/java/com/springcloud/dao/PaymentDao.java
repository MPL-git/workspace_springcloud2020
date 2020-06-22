package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pengl
 * @create 2020-06-22 上午 11:36
 */
@Mapper
public interface PaymentDao {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);

}