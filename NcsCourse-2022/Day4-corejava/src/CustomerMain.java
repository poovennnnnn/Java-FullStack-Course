
public class CustomerMain {

	public static void main(String[] args) {
		
		Customer c1 = new Customer();
		c1.setCustomerId(1232132);
		c1.setCustomerName("sdfsgg");
		c1.setAddress(new Address(12231232,"berlin"));
		c1.print();
		
		
		Customer c2 = new Customer(101,"pooven");
		c2.print();
		
		Customer c3 = new Customer(101,"hari",new Address(344314,"tokyo"));
		c3.print();
		
		
		
		

	}

}

