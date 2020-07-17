package com.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * @author Pengl
 * @create 2020-07-17 上午 11:20
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	private Long id;

	private Long userId;

	private Long productId;

	private Integer count;

	private BigDecimal money;

	private Integer status; //订单状态：0：创建中；1：已完结


}
