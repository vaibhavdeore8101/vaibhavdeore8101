package com.adv.thread;

import com.adv.resourse.Resourse;

public class Thread2 extends Thread {
	
Resourse resourse;
	
	public Thread2(Resourse resourse) {
		this.resourse=resourse;
	}
	
	@Override
	public void run() {
		synchronized (resourse.res2) {
			System.out.println(getName()+"Applied Lock on"+resourse.res2);
			synchronized (resourse.res1) {
				System.out.println(getName()+"Applied Lock On"+resourse.res1);
				
			}
			System.out.println(getName()+"released"+resourse.res1);
			
		}
		System.out.println(getName()+"released"+resourse.res2);
	}

}


