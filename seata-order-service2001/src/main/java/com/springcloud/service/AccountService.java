package com.springcloud.service;

import com.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:32
 */
@FeignClient(value = "seata-account-service")
public interface AccountService {

	@PostMapping(value = "/account/decrease")
	CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
