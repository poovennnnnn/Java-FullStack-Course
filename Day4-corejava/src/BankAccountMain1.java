
public class BankAccountMain1 {

	
	
	public BankAccountMain1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		BankAccount b[]= new BankAccount[3];
		
		for(int i=0; i<b.length;i++) {
			b[i] = new BankAccount((100+i),(100+i*10),new Customer((101+i),("Member "+(i+1)),new Address((1000+i*24),("city "+(i+1)))));
			
		}
		System.out.println("------------------------------------------------");
		System.out.println("S.no    CustomerId   CustomerName  ActNumber  ActBalance  city   zip");
		
		for(int i=0; i<3;i++) {
			
			System.out.println((i+1) +"             "+b[i].getCustomerAccount().getCustomerId()+"    "+b[i].getCustomerAccount().getCustomerName()+"       "+b[i].getActNumber()+ "       "+b[i].getActBalance()+"       "+b[i].getCustomerAccount().getAddress().getCity()+"      "+b[i].getCustomerAccount().getAddress().getZip());
		}

	}

}
