package com.adv.main;

import com.adv.resourse.Pizza;
import com.adv.thread.Dominos;
import com.adv.thread.Friend;

public class PizzaMain {
	
	public static void main(String[] args) {
		
		Pizza pizza=new Pizza();
		Friend f=new Friend(pizza);
		Dominos d=new Dominos(pizza);
		
		f.start();
		d.start();
	}

}
