package com.springcoreannotation.config;

import org.springframework.context.annotation.Bean;

import com.springcoreannotation.bean.EmployeeBean;

public class EmployeeConfig {
	
	@Bean
	public EmployeeBean getEmployee() {
		return new EmployeeBean();
	}


}
