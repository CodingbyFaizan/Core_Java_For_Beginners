package encapsulation.problem1;

public class BankAccount {
	
	//private instance variable
	private int accountNumber;
	private String accountHolderName;
	private double accountBalance;
	
	//setting accountNumber
	public void setAccountNumber(int accNumber) {
		this.accountNumber = accNumber;
	}
	
	//getting accountNumber
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	//setting AccountName
	public void setAccountName(String name) {
		this.accountHolderName = name;
	}
	
	//	getting AccountName
	public String getAccountName() {
		return this.accountHolderName;
	}
	
	//setting AccountBalance
	public void setAccountBalance(double bal) {
		this.accountBalance = bal;
	}
	
	//getting AccountBalance
	public double getAccountBalance() {
		return this.accountBalance;
	}
	
	//deposit method
	public void deposit(double amt) {
		this.accountBalance += amt;
	}
	
	//withdraw method
	public void withdraw(int amt) {
		if(amt <= accountBalance) {
			this.accountBalance -= amt;
		}
		else {
			System.out.println("Invalid amount!");
		}
	}
}
