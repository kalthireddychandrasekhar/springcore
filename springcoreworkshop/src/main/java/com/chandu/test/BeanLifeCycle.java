package com.chandu.test;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BeanLifeCycle implements InitializingBean, DisposableBean{

	public void destroy() throws Exception {
System.out.println("destroy method");		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet() -->called");
	}
	
	public void display() {
		System.out.println("welcome to spring life cycle");
	}

}
