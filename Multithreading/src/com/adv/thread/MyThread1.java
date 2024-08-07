package com.adv.thread;

public class MyThread1 extends Thread {
	
	@Override
	public void run() {
	for(int i=1;i<5;i++) {
		System.out.println("My Thread 1 Is Running");
	}
	}

}
