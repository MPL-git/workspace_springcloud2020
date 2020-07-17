package com.springcloud.dao;

import com.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:24
 */
@Mapper
public interface OrderDao {

	//新建订单
	void create(Order order);

	//修改订单状态，从零改为1
	void update(@Param("userId") Long userId, @Param("status") Integer status);


}
