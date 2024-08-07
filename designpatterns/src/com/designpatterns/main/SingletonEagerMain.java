package com.designpatterns.main;

import com.designpatterns.creational.SingletonEager;

public class SingletonEagerMain {
	
	public static void main(String[] args) {
		
		SingletonEager singletonEager1= SingletonEager.getObject();
		System.out.println(singletonEager1);
		SingletonEager singletonEager2=SingletonEager.getObject();
		System.out.println(singletonEager2);
		SingletonEager singletonEager3=SingletonEager.getObject();
		System.out.println(singletonEager3);
	}

}
