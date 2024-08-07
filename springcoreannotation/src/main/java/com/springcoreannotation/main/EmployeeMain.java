package com.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcoreannotation.bean.EmployeeBean;
import com.springcoreannotation.config.EmployeeConfig;

public class EmployeeMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext
					(EmployeeConfig.class);
		
		EmployeeBean employee1 = context.
				getBean(EmployeeBean.class);
		
		System.out.println(employee1);
		
		((AnnotationConfigApplicationContext)context).close();
	}

}
