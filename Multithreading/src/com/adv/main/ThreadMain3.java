package com.adv.main;

import com.adv.thread.MyThread3;

public class ThreadMain3 {
	public static void main(String[] args) {
		
		
		MyThread3  myThread3=new MyThread3();
		myThread3.start();
		myThread3.setName("Thread");
		myThread3.setPriority(7);
		//myThread3.start();
	}

}
