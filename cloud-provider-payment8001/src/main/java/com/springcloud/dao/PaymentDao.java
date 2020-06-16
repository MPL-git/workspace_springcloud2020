package com.springcloud.dao;

import com.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pengl
 * @create 2020-06-16 下午 5:05
 */
@Mapper
public interface PaymentDao {

	public int create(Payment payment);

	public Payment getPaymentById(@Param("id") Long id);

}
