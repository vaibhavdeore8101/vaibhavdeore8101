package com.adv.resourse;

public class Pizza {
	
	private int availablePizza;

	public synchronized void orderPizza(int orderPizza) {
		System.out.println("Hii order Pizza"+orderPizza+"Pizzas");
		if(availablePizza<orderPizza) {
			System.out.println(orderPizza+"Pizzas not available....wait");
			try {
				this.wait();
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		availablePizza-=orderPizza;
		System.out.println(orderPizza+"Pizzas Deliverd");
		System.out.println(availablePizza+"Pizzas Available");
		
		
		
		
	}
	
	public synchronized void bakedPizza(int bakedPizza) {
		System.out.println("hlw baking "+bakedPizza+"Pizzas");
		availablePizza+=bakedPizza;
		System.out.println(bakedPizza+"Pizzas bakeed");
		System.out.println(availablePizza+"Pizzas available");
		this.notify();
		
	}

}
