package com.tsegars.banking;

public class InSufficientBalanceException extends Exception {
	public String toString() {
		return "Balance not sufficient ";
	}
}
