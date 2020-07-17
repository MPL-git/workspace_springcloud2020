package com.springcloud.service;

import com.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:29
 */
@FeignClient(value = "seata-storage-service")
public interface StorageService {

	@PostMapping(value = "/storage/decrease")
	CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);

}
