
public class BankAccount {
	
	private int actNumber;
	private double actBalance;
	private Customer customerAccount;
	
	BankAccount(){
		
		this.actNumber = 000000;
		this.actBalance = 100;
		this.customerAccount = new Customer(101,"hari",new Address(344314,"tokyo"));
		System.out.println("default Constructor");
		
	}
	
	BankAccount(int actNumber, double actBalance){
		
		this.actNumber=actNumber;
		this.actBalance=actBalance;
		this.customerAccount = new Customer(101,"levis",new Address(234545345,"tokyo"));
		System.out.println("two param Constructor");
		
	}
	
	BankAccount(int actNumber, double actBalance, Customer customerAccount){
		this.actNumber=actNumber;
		this.actBalance=actBalance;
		this.customerAccount=customerAccount;
		System.out.println("three param Constructor");
		
	}
	
	
	
	public int getActNumber() {
		return actNumber;
	}
	public void setActNumber(int actNumber) {
		this.actNumber = actNumber;
	}
	public double getActBalance() {
		return actBalance;
	}
	public void setActBalance(double actBalance) {
		this.actBalance = actBalance;
	}
	public Customer getCustomerAccount() {
		return customerAccount;
	}
	public void setCustomerAccount(Customer customerAccount) {
		this.customerAccount = customerAccount;
	}
	
	
	public void showBalance() {
		System.out.println("Account Balance is :"+actBalance);
	}
	
	
	public void withdraw(double howMuch) {
		
		System.out.println("Before Withdraw Account Balance is  :"+actBalance);
		System.out.println("withdraw ammount is:"+ howMuch);
		
		if(howMuch > actBalance) {
			System.out.println("Insufficient fund");
			System.out.println("After Withdraw Account Balance is  :"+actBalance);
		}
			actBalance -= howMuch; 	
	}
	
	public void deposit(double howMuch) {
		System.out.println("Before deposit Account Balance is  :"+actBalance);
		System.out.println("Deposit ammount is:"+ howMuch);
		actBalance += howMuch;
		System.out.println("Before deposit Account Balance is  :"+actBalance);
		
	}
	
	

}
