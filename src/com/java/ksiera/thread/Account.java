package com.java.ksiera.thread;

/**Imagine that two people each have a checkbook
for a single checking account (or two people each have ATM cards, but both cards
are linked to only one account).
In this example, we have a class called Account that represents a bank account.
To keep the code short, this account starts with a balance of 50 and can be used only
for withdrawals. The withdrawal will be accepted even if there isn't enough money
in the account to cover it. The account simply reduces the balance by the amount
you want to withdraw:*/

public class Account {
	
	private int balance=500;
	
	public int getBalance()
	{
		return balance;
	}
	
	public void withdraw(int amnt)
	{
		this.balance=balance-amnt;
	}

}
