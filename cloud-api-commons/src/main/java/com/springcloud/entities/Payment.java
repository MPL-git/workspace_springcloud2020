package com.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author Pengl
 * @create 2020-06-20 下午 4:02
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment implements Serializable {

	private Long id;
	private String serial;

}
