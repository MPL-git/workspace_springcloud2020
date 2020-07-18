package com.springcloud.service;

/**
 * @author Pengl
 * @create 2020-07-18 下午 2:50
 */
public interface StorageService {

	// 扣减库存
	void decrease(Long productId, Integer count);

}
