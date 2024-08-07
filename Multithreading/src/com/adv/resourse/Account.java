package com.adv.resourse;

public class Account {
	
	private int balance;
	public  Account(int balance) {
		this.balance=balance;
	}
	
	public int checkBalance() {
		return balance;
	}

	public synchronized void deposit(int amount) {
		System.out.println("Trying To Deposite"+amount+"Rs");
		balance+=amount;
		System.out.println("Deposite Succesfull");
		System.out.println("Account Balance"+checkBalance());
		
	}

	public void withdraw(int amount) {
		System.out.println("trying to withdraw Amount"+amount+"Rs");
		if(balance>=amount) {
			balance-=amount;
			System.out.println("Withdraw Succesfull");
			System.out.println("Account Balance"+checkBalance());
		}
		else {
			System.out.println("Insufficient Balance");
		}
		
	}

}
