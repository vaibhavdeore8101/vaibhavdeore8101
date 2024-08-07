package com.adv.thread;

import com.adv.resourse.Pizza;

public class Friend extends Thread {
	
	private Pizza pizza;
	
	public Friend(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		pizza.bakedPizza(5);
	}
	

}
