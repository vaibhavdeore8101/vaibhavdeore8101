package com.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcoreannotation.bean.StudentBean;
import com.springcoreannotation.config.StudentConfig;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = 
				new AnnotationConfigApplicationContext
					(StudentConfig.class);
		
		StudentBean student2 = (StudentBean) context.
				getBean("student2");
		
		System.out.println(student2);
		
		((AnnotationConfigApplicationContext)context).close();
		
	}

}
