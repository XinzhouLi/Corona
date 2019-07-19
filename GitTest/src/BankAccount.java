public class BankAccount {
	double balance;
	String accountNumber;
	
	public BankAccount(double d, String string) {
	// TODO Auto-generated constructor stub
	}

	public double getBalance() {
		return balance;
	}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	public String toString() {
		return accountNumber + ": " + balance;
	}
	public void withdraw(double amount) {
		balance -= amount;
	}
	public void deposit (double amount) {
		balance += amount;
	}
	public void transfer(double amount, BankAccount toAccount) {
		if(balance >= amount) {
			balance -= amount;
			toAccount.balance += amount;
		}
	}
	public static void main(String[] args){
		BankAccount b1 = new BankAccount(100.0, "123");
		
	}
}