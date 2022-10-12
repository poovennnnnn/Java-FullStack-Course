
public class BankAccountMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		BankAccount b1 = new BankAccount();
		b1.getCustomerAccount().print();
		b1.showBalance();
		b1.withdraw(87);
		b1.deposit(100.98);
		
		System.out.println("*********************************");
		
		BankAccount b2 = new BankAccount(123123123,1000);
		b2.getCustomerAccount().print();
		b2.showBalance();
		b2.withdraw(1800);
		b2.withdraw(800);
		b2.deposit(200.98);
		
		System.out.println("*********************************");
		
		BankAccount b3 = new BankAccount(1245,500, new Customer(101,"pooven",new Address(640913,"tokyo")));
		b3.getCustomerAccount().print();
		b3.showBalance();
		b3.withdraw(800);
		b3.withdraw(400);
		b3.deposit(200.98);
		
		System.out.println("*********************************");
		
	}

}
