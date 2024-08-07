package com.adv.main;

import com.adv.thread.MyThread1;
import com.adv.thread.MyThread2;

public class ThreadMain1 {
	public static void main(String[] args) {
		
		MyThread1 myThread1=new MyThread1();
		myThread1.start();
		MyThread2 myThread2=new MyThread2();
		myThread2.start();
		
	}

}
