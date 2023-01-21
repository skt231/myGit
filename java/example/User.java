package example;

public class User {
	String user;
	Account a;

	public User(String user, Account account) {
		this.user = user;
//		this.account = account;
	}

	public User(String string) {
		// TODO Auto-generated constructor stub
	}

	void user() {
	};

	public Account getAccount() {
		return a;
	}

	void setAccount(Account account) {
		this.a = account;
	}

	public void setName(String user) {
		this.user = user;

	}

	public String getName() {
		return user;
	}

}