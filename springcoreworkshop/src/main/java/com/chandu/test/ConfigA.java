package com.chandu.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {
	@Bean
	public BeanA getBeanA() {
		return new BeanA();
	}

}
