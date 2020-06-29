package com.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Pengl
 * @create 2020-06-29 下午 4:35
 * Ribbon之手写轮询算法
 */
@Component
public class MyLB implements LoadBalancer {

	private AtomicInteger atomicInteger = new AtomicInteger(0);

	/**
	 * 使用 CAS + 自旋锁
	 * @return
	 */
	public final int getAndIncrement() {
		int current;
		int next;
		do {
			current = this.atomicInteger.get();
			next = current >= 2147483647 ? 0 : current + 1;
		}while (!this.atomicInteger.compareAndSet(current, next));
		System.out.println("*****第几次访问，次数next: "+next);
		return next;
	}

	@Override
	public ServiceInstance instances(List<ServiceInstance> serviceInstances) {
		int index = getAndIncrement() % serviceInstances.size();
		return serviceInstances.get(index);
	}

}
