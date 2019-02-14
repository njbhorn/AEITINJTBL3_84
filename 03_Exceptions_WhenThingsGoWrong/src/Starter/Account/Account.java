package Starter.Account;

public class Account {
	private double balance;
	private String holder;
	private String number;

	public double getBalance() {
		return balance;
	}

	public String getHolder() {
		return holder;
	}

	public String getNumber() {
		return number;
	}

	public Account(double balance, String holder, String number) {
		this.balance = balance;
		this.holder = holder;
		this.number = number;
	}

	public void deposit(double amount) {
		// put 'if(...) throw' code here
		balance += amount;
	}

	public boolean withdraw(double amount) {
		boolean result = false;

		// put 'if(...) throw' code here

		if (amount < balance) {
			balance -= amount;
			result = true;
		}
		return result;
	}
	
	// public void withdraw(double amount) {
	// if (amount < 0)
	// {
	// throw new IllegalArgumentException("Can't withdraw -ve amounts");
	// }
	// if (amount > balance)
	// {
	// throw new InsufficientFundsException(???, amount);
	// }
	// balance -= amount;
	// }

	public static boolean transfer(double amount, Account from, Account to) {
		boolean result = false;
		result = from.withdraw(amount);
		if (result) {
			to.deposit(amount);
		}

		from.audit("Transfer attempt to " + to.number + ". Completion Status: "
				+ result);

		return result;
	}

	public String getDetails() {
		return number + " " + holder + " " + balance;
	}

	public void audit(String message) {
		System.out.println(number + ": " + message);
	}

}
