package com.adv.main;

import com.adv.resourse.Resourse;
import com.adv.thread.Thread1;
import com.adv.thread.Thread2;

public class DeadLock {
	
	public static void main(String[] args) {
		
		Resourse resourse=new Resourse();
		Thread1 th1=new Thread1(resourse);
		Thread2 th2=new Thread2(resourse);
		th1.setName("Thread 1 ");
		th2.setName("Thread 2 ");
		
		th1.start();
		th2.start();
	}

}
