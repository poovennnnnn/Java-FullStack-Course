
public class EmployeeAndAddress {

	public static void main(String[] args) {
	
		Address address = new Address();
		address.city="singapore";
		address.zip=632132;
		
		Employee e1 = new Employee();
		e1.empCode=101;
		e1.empName="kevin";
		e1.address= address;
		e1.printDetails();

	}

}
