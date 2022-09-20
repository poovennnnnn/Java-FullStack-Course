
public class Employee {
	
	int empCode;
	String empName;
	Address address;
	
	void printDetails() {
		System.out.println("Employee Code ="+empCode);
		System.out.println("Empployee Name = "+empName);
		System.out.println("City ="+address.city);
		System.out.println("Zip Code ="+address.zip);
	}

}
