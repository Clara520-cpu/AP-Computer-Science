/*
 * Zach Panzarino
 * 9/29/15
 * Program 3.1 & 3.2 - tests the methods of the BankAccount class
 */

public class BankAccountTester {
	public static void main(String[] args){
		 BankAccount myBankAccount = new BankAccount();
       myBankAccount.deposit(500);
       myBankAccount.withdraw(216);
       double result = myBankAccount.getBalance();
	}
}

/* Program Output
The bank account has a balance of $100.0
Expected output: $100.0

Mom's savings bank account value: $1100.0
Expected output: $1100.0
*/
