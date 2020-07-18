package com.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pengl
 * @create 2020-07-18 下午 2:54
 */
@Configuration
@MapperScan({"com.springcloud.dao"})
public class MyBatisConfig {


}
