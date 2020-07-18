package com.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author Pengl
 * @create 2020-07-18 下午 2:48
 */
@Mapper
public interface StorageDao {

	//扣减库存信息
	void decrease(@Param("productId") Long productId, @Param("count") Integer count);


}
