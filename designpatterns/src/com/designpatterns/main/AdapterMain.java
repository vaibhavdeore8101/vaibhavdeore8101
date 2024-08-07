package com.designpatterns.main;

import com.designpatterns.structural.Adapter;

public class AdapterMain {
	
	public static void main(String[] args) {
		
		Adapter adapter=new Adapter();
		adapter.mensDay(adapter);
		adapter.womensDay(adapter);
	}

}
