package com.chandu.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {
	@Bean
	public BeanB getBean() {
		return new BeanB();
	}
}
