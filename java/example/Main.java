package example;

import example.Account;

public class Main {

	public static void main(String[] args) {
		Example example = new Example();
//		Example example2 = new Example("생성자1");
//		Example example3= new Example("생성자2",200);
//		example.m1();
//		example.m1(3);
//		example.m1(5, false);
//		example.m1(false, 6);

		String message = "hi";
		int Code = 200;
		example.getMessage();
		System.out.println(example.getMessage());
		example.setMessage(message);
		System.out.println(example.getCode());
		example.setCode(Code);
		System.out.println(example.getCode());
		example.setNums(3, 5);
		example.printNums();
		System.out.println("");
		example.printNums(4);
		System.out.println("");
		System.out.println("----------------------------------------------");

//		Account account1 = new Account();
//		Account account2 = new Account(10000);
//		// balance: 0
//		System.out.println("balance: " + account1.getBalance());
//		account1.deposit(5000);
//		// balance: 5000
//		System.out.println("balance: " + account1.getBalance());
//		// balance: 10000
//		System.out.println("balance: " + account2.getBalance());
//		account2.withdraw(3000);
//		// balance: 7000
//		System.out.println("balance: " + account2.getBalance());
//		// balance: 5000
//		System.out.println("balance: " + account1.getBalance());
//		account1.withdraw(10000);
//		// balance: 5000
//		System.out.println("balance: " + account1.getBalance());
		System.out.println("----------------------------------------------");
//		Account account1 = new Account(10000);
//		Account account2 = new Account();
//		User user1 = new User("user1", account1);
//		User user2 = new User("user2");
//		// user1 name is user1
//		System.out.println("user1 name is "+user1.getName());
//		user1.setName("user123");
//		// user1 name is user123
//		System.out.println("user1 name is "+user1.getName());
//		// user2 account is null
//		System.out.println("user2 account is "+user2.getAccount());
//		user2.setAccount(account2);
//		// user2 account is Account()
//		System.out.println("user2 account is "+user2.getAccount());
		System.out.println("-----------------------------------------------");
		Account account1 = new Account(10000);
		Account account2 = new Account(0);
		User user1 = new User("user1", account1);
		User user2 = new User("user2", account2);
		// account1 : 10000, account2 : 0
		System.out.print("account1 : " + account1.getAccount().getBalance() + " ");
		System.out.println("account2 : " + account2.getAccount().getBalance());
		user1.getAccount().transfer(1000, user2.getAccount());
		// account1 : 9000, account2 : 1000
		System.out.print("account1 : " + account1.getAccount().getBalance() + " ");
		System.out.println("account2 : " + account2.getAccount().getBalance());
	}

}
