package com.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.springcloud.entities.CommonResult;

/**
 * @author Pengl
 * @create 2020-07-04 下午 4:47
 */
public class CustomerBlockHandler {

	public static CommonResult handlerException(BlockException exception) {
		return new CommonResult(4444, "按资客户自定义,global handlerEception-----1");
	}

	public static CommonResult handlerException2(BlockException exception) {
		return new CommonResult(4444, "按资客户自定义,global handlerEception-----2");
	}

}
