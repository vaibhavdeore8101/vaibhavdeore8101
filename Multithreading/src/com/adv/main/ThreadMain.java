package com.adv.main;

import com.adv.thread.MyThread1;
import com.adv.thread.MyThread2;

public class ThreadMain {
	
	public static void main(String[] args) {
		
		MyThread1 mythread1=new MyThread1();
		MyThread2 mythread2=new MyThread2();
		//Thread thread=new Thread(mythread2);
		
		mythread1.start();
		mythread2.start();
	}

}
