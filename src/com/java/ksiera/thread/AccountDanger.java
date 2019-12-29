package com.java.ksiera.thread;

public class AccountDanger implements Runnable {
	Account account;

	public AccountDanger() {
		this.account = new Account();
		
	}

	public static void main(String[] args) {
		AccountDanger myRun=new AccountDanger();
		Thread one=new Thread(myRun);
		Thread two=new Thread(myRun);
		one.setName("Fred");
		two.setName("Lucy");
		one.start();
		two.start();

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			 makeWithdrawl(100);
			 System.out.println("Bal is "+account.getBalance());
			if(account.getBalance()<100)
			{
			   	
				System.out.println("account is overdrawn!");
			}

		}
	}

	private synchronized void makeWithdrawl(int amnt) {
		if (account.getBalance() >= amnt) {
			System.out.println(  Thread.currentThread().getName()+ " is going to withdraw ");
			try {

				Thread.sleep(500);
			} catch (InterruptedException e) {
				System.out.println(e.getMessage());
			}
			account.withdraw(amnt);
			System.out.println(Thread.currentThread().getName() + " completes the withdwal");
		}
		else {
			System.out.println("Not enough in account for "
					+ Thread.currentThread().getName()
					+ " to withdraw " + account.getBalance());
		}
	}
}
