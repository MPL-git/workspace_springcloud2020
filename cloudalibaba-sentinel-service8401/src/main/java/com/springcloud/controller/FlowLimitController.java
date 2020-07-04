package com.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @author Pengl
 * @create 2020-07-04 下午 2:00
 */
@RestController
@Slf4j
public class FlowLimitController {

	@GetMapping(value = "/testA")
	public String testA() {
		return "--------testA";
	}

	@GetMapping(value = "/testB")
	public String testB() {
		return "--------testB";
	}

	@GetMapping(value = "/testD")
	public String testD() {
		//暂停几秒钟线程
		/*try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		log.info("testD 测试RT");*/

		log.info("testD 异常比例");
		int age = 10/0;
		return "--------testD";
	}

	@GetMapping(value = "/testE")
	public String testE() {
		log.info("testE 测试异常数");
		int age = 10/0;
		return "--------testE";
	}

	@GetMapping(value = "/testHotKey")
	@SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
	public String testHotKey(@RequestParam(value = "p1", required = false) String p1,
							 @RequestParam(value = "p2", required = false) String p2) {
		int age = 10/0;
		return "---------testHotKey";
	}
	public String deal_testHotKey(String p1, String p2, BlockException exception) {
		//sentinel 系统默认的提示：Blocked by Sentinel (flow limiting)
		return "--------deal_testHotKey,o(╥﹏╥)o";
	}

}
