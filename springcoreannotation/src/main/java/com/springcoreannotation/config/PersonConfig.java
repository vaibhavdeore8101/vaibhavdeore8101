package com.springcoreannotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.springcoreannotation.bean.AadharBean;


@ComponentScan(basePackages = "com.springcoreannotation")
public class PersonConfig {
	
	@Bean
	public int getId() {
		return 1;
	}
	
	@Bean
	public String getName() {
		return "Ajit";
	}
	
	@Bean
	public AadharBean getAadhar() {
		return new AadharBean(1, 78965412342L);
	}


}
