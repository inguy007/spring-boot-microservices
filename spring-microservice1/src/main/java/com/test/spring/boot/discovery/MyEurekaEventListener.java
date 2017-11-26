package com.test.spring.boot.discovery;

import org.springframework.stereotype.Component;

import com.netflix.discovery.EurekaEvent;
import com.netflix.discovery.EurekaEventListener;

@Component
public class MyEurekaEventListener implements EurekaEventListener{

	@Override
	public void onEvent(EurekaEvent e) {
		System.out.println("Event is :"+e);
	}

}
