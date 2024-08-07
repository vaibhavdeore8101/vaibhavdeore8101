package com.SpringCore.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SpringCore.bean.StudentBean;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/SpringCore/resources/StudentConfig.xml");
		
		
		
		StudentBean student1 = (StudentBean) context.getBean("student2");
		
		System.out.println(student1);
		
	((ClassPathXmlApplicationContext)context).close();
	}
	
	
}
