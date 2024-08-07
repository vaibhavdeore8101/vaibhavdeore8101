package com.adv.thread;

public class MyThread2 extends Thread {
	
	@Override
	public void run() {
	for(int i=1;i<5;i++) {
		System.out.println("My Thread 2 Is Running");
	}
	}


}
