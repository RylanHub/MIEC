package Lab8;

/*  @Author: LinRui
	@Time: May 22, 2022 10:59:38 AM	*/

public class TestBankAccount {

	public static void main(String[] args) {
		BankAccount Mary = new BankAccount("Mary Bloggs", 500, 100001);
		BankAccount Joe = new BankAccount("Joe Spot", 1000, 100002);
		
		System.out.println("Balance is " + Mary.getBalance());
		Joe.print();
		Joe.deposit(500);
		Joe.print();
		Mary.print();
		Mary.withdrawal(600);
		Mary.withdrawal(400);
		Mary.setName("Mary Bloggs-Spot");
		Mary.print();
		
	}

}
