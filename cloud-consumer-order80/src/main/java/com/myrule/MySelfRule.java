package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Pengl
 * @create 2020-06-29 下午 3:50
 */
@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RandomRule(); //定义为随机
	}

}
