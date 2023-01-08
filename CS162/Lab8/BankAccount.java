package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 10:38:21 AM	*/

public class BankAccount {
	private String name;
	private double balance;
	private int accountID;
	
	
	public BankAccount(String name, double balance, int accountID ) {
		this.name = name;
		this.balance = balance;
		this.accountID = accountID;		
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getAccountID() {
		return accountID;
	}

	
	public void deposit(double money) {
		balance =  balance + money;	
	}
	
	public void withdrawal(double money) {
		if(money<=balance) {
			balance = balance-money;
		}else {
			System.out.println("Insufficient funds");
		}
	}
	
	public void print() {
		System.out.println("******************");
		System.out.println("Name: " + name);
		System.out.println("Balance: " + balance);
		System.out.println("AccountID: " + accountID);
		System.out.println("******************");	
	}
	
	

}
