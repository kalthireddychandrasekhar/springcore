package com.chandu.test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import(value= {ConfigA.class})
@ImportResource(locations= {"classpath:/namespaces.xml"})
public class ConfigC {
	@Bean
	public BeanC getBeanC() {
		return new BeanC();
	}

}
