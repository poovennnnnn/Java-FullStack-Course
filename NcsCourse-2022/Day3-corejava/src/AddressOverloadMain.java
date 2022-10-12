
public class AddressOverloadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address studentAddress = new Address();
		studentAddress.setCity("singapore");
		studentAddress.setZip(2343432);
		
		Address customerAddress = new Address();
		customerAddress.setCity("singapore");
		customerAddress.setZip(2343432);
		
		
		Student1 s1 = new Student1();
		s1.setStudenId(201);
		s1.setStudentName("pooven");
		s1.setAddress(studentAddress);
		
		Student1 s2 = new Student1();
		s2.setStudenId(2201);
		s2.setStudentName("scottt");
		s2.setAddress(studentAddress);
		
		
	    Customer1 c = new Customer1();
	    c.setAddress(customerAddress);
	    c.setCustomerName("sdfdf");
	    c.setCustomerId(234234);
	    
	    Customer1 c2 = new Customer1();
	    c2.setAddress(customerAddress);
	    c2.setCustomerName("asdfsadfsf");
	    c2.setCustomerId(234234);
	    
	    AddressOverload col = new AddressOverload();
	    col.printAddress(c);
	    System.out.println("--------------------------");
	    col.printAddress(s1);
	    System.out.println("--------------------------");
	    col.printAddress(c2);
	    System.out.println("--------------------------");
	    col.printAddress(s2);
	    
	}

}
