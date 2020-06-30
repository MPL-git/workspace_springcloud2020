package com.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @author Pengl
 * @create 2020-06-30 上午 10:03
 */
@Service
public class PaymentService {

	public String paymentInfo_OK(Integer id) {
		return "线程池："+Thread.currentThread().getName()+" paymentInfo_OK,id："+id+"\t"+"O(∩_∩)O哈哈~";
	}

	@HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
		@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "3000")
	})
	public String paymentInfo_Timeout(Integer id) {
		int timeNuber = 2;
		try {
			TimeUnit.SECONDS.sleep(timeNuber);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "线程池："+Thread.currentThread().getName()+" paymentInfo_TimeOut,id："+id+"\t"+"O(∩_∩)O哈哈~"+"  耗时(秒)："+timeNuber;
	}

	public String paymentInfo_TimeoutHandler(Integer id) {
		return "/(ToT)/调用支付接口超时或异常、\t" + "\t当前线程池名字" + Thread.currentThread().getName();
	}

}
