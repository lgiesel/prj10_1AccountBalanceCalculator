package giesel.account;

import giesel.interfaces.Balanceable;
import giesel.interfaces.Depositable;
import giesel.interfaces.Withdrawable;

public class Account implements Balanceable, Depositable, Withdrawable {

	protected double balance = 0.0;
	
	@Override
	public void withdraw(double amount) {
		balance-=amount;
	}

	@Override
	public void deposit(double amount) {
		balance+=amount;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {
		balance = amount;
	}

}
