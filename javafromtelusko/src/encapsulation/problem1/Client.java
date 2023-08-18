package encapsulation.problem1;

public class Client {
	public static void main(String[] args) {
		BankAccount bank = new BankAccount();
		
		//accessing private instance variables using setter()
		bank.setAccountNumber(123456789);
		bank.setAccountName("Irfan");
		bank.setAccountBalance(1000);
		
		//getting updated values of the private instances
		System.out.println(bank.getAccountNumber());
		System.out.println(bank.getAccountName());
		System.out.println(bank.getAccountBalance());
		
		//calling deposit and withdraw method
		bank.deposit(1000);
		bank.withdraw(500);
		
		System.out.println(bank.getAccountBalance());
		
	}
}	
