package com.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.bean.CompanyBean;

public class CompanyMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/SpringCore/resources/CompanyEmployeeConfig.xml");
		
		CompanyBean company= context.getBean(CompanyBean.class);
		
		System.out.println(company);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
