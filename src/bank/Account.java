package bank;

public class Account {
	private int number;
	private String holder;
	private double balance;
	
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDepositValue) {
		this.number = number;
		this.holder = holder;
		deposit(initialDepositValue);
		toString();
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.printf(
				"Olá sr. %s, você fez um depósito de $ %.2f, seu saldo é de $ %.2f",
				getHolder(), amount, getBalance());
	}
	
	public void withdraw(double amount) {
		this.balance -= (amount + 5);
		System.out.printf(
				"Olá sr. %s, você fez um saque de $ %.2f, seu saldo é de $ %.2f",
				getHolder(), amount, getBalance());
	}	

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public String toString() {
		return String.format(
				"Account: %d, Holder: %s, Balance: $ %.2f.",
				this.number, this.holder, this.balance);			
	}
}
