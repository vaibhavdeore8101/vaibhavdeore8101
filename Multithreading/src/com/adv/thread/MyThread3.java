package com.adv.thread;

public class MyThread3 extends Thread {

	
	@Override
	public void run() {
	
		System.out.println("Thread  Name:"+getName());
		System.out.println("Thread Priority:"+this.getPriority());
	}
}
