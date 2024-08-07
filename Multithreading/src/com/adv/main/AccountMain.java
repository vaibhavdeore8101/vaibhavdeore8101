package com.adv.main;

import com.adv.resourse.Account;
import com.adv.thread.Husband;
import com.adv.thread.Wife;

public class AccountMain {
	
	public static void main(String[] args) {
		
		Account account=new Account(1000);
		Husband husband=new Husband(account);
		Wife wife=new Wife(account);
		
		husband.start();
		wife.start();
	}

}
