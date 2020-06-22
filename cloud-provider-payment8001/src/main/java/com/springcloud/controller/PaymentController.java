package com.springcloud.controller;

import com.springcloud.entities.CommonResult;
import com.springcloud.entities.Payment;
import com.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Pengl
 * @create 2020-06-16 下午 5:23
 */
@RestController
@Slf4j
public class PaymentController {

	@Resource
	private PaymentService paymentService;

	@Value("${server.port}")
	private String serverPort;

	@Resource
	private DiscoveryClient discoveryClient;

	@PostMapping(value = "payment/create")
	public CommonResult create(@RequestBody Payment payment) {
		int result = paymentService.create(payment);
		if(result > 0) {
			return new CommonResult(200, "插入数据库成功，serverPort："+serverPort, result);
		}else {
			return new CommonResult(444, "插入数据库失败", null);
		}
	}

	@GetMapping(value = "payment/get/{id}")
	public CommonResult getPaymentById(@PathVariable("id") Long id) {
		Payment payment = paymentService.getPaymentById(id);
		if(payment != null) {
			return new CommonResult(200, "查询成功，serverPort："+serverPort, payment);
		}else {
			return new CommonResult(444, "没有对应记录ID："+id, null);
		}
	}

	@GetMapping(value = "payment/discovery")
	public Object discovery() {
		List<String> services = discoveryClient.getServices();
		for (String element : services) {
			log.info("***** element:"+element);
		}
		List<ServiceInstance> instances = discoveryClient.getInstances("CLOUD-PAYMENT-SERVICE");
		for (ServiceInstance instance : instances) {
			log.info(instance.getServiceId()+"\t"+instance.getHost()+"\t"+instance.getPort()+"\t"+instance.getUri());
		}
		return this.discoveryClient;
	}


}
