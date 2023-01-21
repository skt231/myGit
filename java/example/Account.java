package example;

public class Account {

	String user;
	Account account;
	int balance;

	public void setBalance() {

	}

	public int getBalance() {
		// TODO Auto-generated method stub
		return balance;
	}

	public void deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;

	}

	public void withdraw(int i) {
		if (balance > i) {
			balance -= i;
		}
	}

	public Account() {
		balance = 0;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(int i) {
		balance = i;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Account getAccount() {
		return account;
	}

	public Account(String user, Account account, int balance) {
		super();
		this.user = user;
		this.account = account;
		this.balance = balance;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void transfer(int amount, Account otherAccount) {
		balance -= amount;
//		otherAccount.setAccount(amount);
	}

}
