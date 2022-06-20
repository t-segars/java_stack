package com.tsegars.banking;

public class BankAccount {
	private int actNumber;
	private String customerName;
	private int actBalance;
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BankAccount(int actNumber, String customerName, int actBalance) {
		super();
		this.actNumber = actNumber;
		this.customerName = customerName;
		this.actBalance = actBalance;
	}
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getActBalance() {
		return actBalance;
	}
	public void setActBalance(int actBalance) {
		this.actBalance = actBalance;
	}
	public void deposit(int depositAmount) {
		actBalance += depositAmount;
//		after performing deposit I need to store the deposit details in 
//		an object of a Transaction class
//		and then store that object in some collection such as LinkedList
//		for future reference
		Transaction t = new Transaction();
	}
	public void withdraw(int withdrawAmount) {
		if(withdrawAmount > actBalance) {
			try {
				throw new InSufficientBalanceException();
		} catch (InSufficientBalanceException e) {
            // TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
		actBalance -= withdrawAmount;
//		after performing withdraw I need to store the deposit details in 
//		an object of a Transaction class
//		and then store that object in some collection such as LinkedList
//		for future reference
		}
}

