package com.adv.thread;

import com.adv.resourse.Resourse;

public class Thread1 extends Thread {
	
	Resourse resourse;
	
	public Thread1(Resourse resourse) {
		this.resourse=resourse;
	}
	
	@Override
	public void run() {
		synchronized (resourse.res1) {
			System.out.println(getName()+"Applied Lock on"+resourse.res1);
			synchronized (resourse.res2) {
				System.out.println(getName()+"Applied Lock On"+resourse.res2);
				
			}
			System.out.println(getName()+"released"+resourse.res2);
			
		}
		System.out.println(getName()+"released"+resourse.res2);
	}

}
