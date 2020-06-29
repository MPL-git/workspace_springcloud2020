package com.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @author Pengl
 * @create 2020-06-29 下午 4:32
 */
public interface LoadBalancer {

	ServiceInstance instances(List<ServiceInstance> serviceInstances);

}
