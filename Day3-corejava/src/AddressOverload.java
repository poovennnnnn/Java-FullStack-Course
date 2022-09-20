
public class AddressOverload {
	public void printAddress(Student1 student) {
		
		System.out.println("Student id " +student.getStudenId());
		System.out.println("student Name is " + student.getStudentName());
		System.out.println("Student City :"+ student.getAddress().getCity());
		System.out.println("Student ZipCode :"+ student.getAddress().getZip());
	}

	public void printAddress(Customer1 customer) {
		System.out.println("customer Id " +customer.getCustomerId());
		System.out.println("customer Name is " + customer.getCustomerName());
		System.out.println("Customer City :"+ customer.getAddress().getCity());
		System.out.println("Customer ZipCode :"+ customer.getAddress().getZip());
	}
}
