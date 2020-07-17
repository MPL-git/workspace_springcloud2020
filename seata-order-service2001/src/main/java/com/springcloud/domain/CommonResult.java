package com.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

	private Integer code;
	private String message;
	private T data;

	public CommonResult(Integer code, String message) {
		this(code, message, null);
	}

}
