package com.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author Pengl
 * @create 2020-07-18 下午 3:09
 */
@Mapper
public interface AccountDao {

	/**
	 * 扣减账户余额
	 */
	void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
