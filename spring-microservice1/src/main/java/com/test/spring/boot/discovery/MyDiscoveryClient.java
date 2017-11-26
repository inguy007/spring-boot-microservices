package com.test.spring.boot.discovery;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.netflix.eureka.EurekaDiscoveryClient;
import org.springframework.stereotype.Component;

import com.netflix.discovery.EurekaEvent;

@Component
public class MyDiscoveryClient {

	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Autowired
	private EurekaDiscoveryClient eurekaDiscoveryClient;
	
	@Autowired
	private com.netflix.discovery.DiscoveryClient sd;
	
	@Autowired
	private MyEurekaEventListener eurekaEventListener;
	
	@PostConstruct
	public void init(){
		discoveryClient.getServices().stream().forEach(x->System.out.println(x));
		sd.registerEventListener(eurekaEventListener);
		
		System.out.println(sd.getApplications().getAppsHashCode());
		
	}

	
}

