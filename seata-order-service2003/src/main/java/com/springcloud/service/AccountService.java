package com.springcloud.service;

import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Pengl
 * @create 2020-07-18 下午 3:10
 */
public interface AccountService {

	/**
	 * 扣减账户余额
	 */
	void decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
