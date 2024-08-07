package com.adv.thread;

import com.adv.resourse.Account;

public class Wife extends  Thread{
	
	private Account account;
	
	public Wife(Account account){
		this.account=account;
	}
	
	@Override
	public void run() {
	 account.deposit(500);
	 account.withdraw(200);
	}

}
