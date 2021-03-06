/*
Zach Panzarino and Jeremy Switlyk
2/5/16
Program 10.2 - creating a savings account
*/

public class BankAccount {
	private double balance;
	public BankAccount(){
		balance = 0;
	}
	public BankAccount(double initialBalance){
		balance = initialBalance;
	}
	public String deposit(double amount){
		if (amount>=0){
			balance += amount;
			return "Completed";
		}
		else
			return "Cannot deposit a negative amount";
	}
	public String withdraw(double amount){
		if (amount<0)
			return "Cannot withdraw a negative amount";
		else {
			if (balance-amount>=0){
				balance -= amount;
				return "Completed";
			}
			else
				return "Cannot withdraw more than the current balance";
		}
	}
	public double getBalance(){
		return balance;
	}
	public void transfer(double amount, BankAccount other){
		withdraw(amount);
		other.deposit(amount);
	}
}