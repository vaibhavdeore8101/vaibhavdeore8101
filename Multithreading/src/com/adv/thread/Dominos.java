package com.adv.thread;

import com.adv.resourse.Pizza;

public class Dominos extends Thread {

	private Pizza pizza;
	
	public Dominos(Pizza pizza) {
		this.pizza=pizza;
	}
	
	@Override
	public void run() {
		pizza.orderPizza(5);
	}
}
