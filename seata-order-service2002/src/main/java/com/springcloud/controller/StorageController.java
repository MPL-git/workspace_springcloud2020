package com.springcloud.controller;

import com.springcloud.domain.CommonResult;
import com.springcloud.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pengl
 * @create 2020-07-18 下午 2:53
 */
@RestController
public class StorageController {

	@Autowired
	private StorageService storageService;


	//扣减库存
	@RequestMapping("/storage/decrease")
	public CommonResult decrease(Long productId, Integer count) {
		storageService.decrease(productId, count);
		return new CommonResult(200,"扣减库存成功！");
	}


}
