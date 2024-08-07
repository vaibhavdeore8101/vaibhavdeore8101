package com.springcoreannotation.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springcoreannotation.bean.PersonBean;
import com.springcoreannotation.config.PersonConfig;

public class PersonMain {
	
public static void main(String[] args) {
	

	ApplicationContext context = 
			new AnnotationConfigApplicationContext
				(PersonConfig.class);
	
	PersonBean person1 = context.
			getBean(PersonBean.class);
	
	System.out.println(person1);
	
	((AnnotationConfigApplicationContext)context).close();
}

}
