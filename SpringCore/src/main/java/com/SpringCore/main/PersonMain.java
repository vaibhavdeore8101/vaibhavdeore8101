package com.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.bean.PersonBean;

public class PersonMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/SpringCore/resources/PersonAdharConfig.xml");
		
		PersonBean person= context.getBean(PersonBean.class);
		
		System.out.println(person);
		
		((ClassPathXmlApplicationContext)context).close();
	}

}
