
public class EmployeeMian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String empType = "permanent";
		if(empType == "permanent") {
			PermanentEmployee p1 = new PermanentEmployee(101, "ssdfsdf", 7000);
			EmployeeUtility.showNetSalary(p1);
		}else {
			ContractEmployee c1 = new ContractEmployee(102,"afasfasf",7000);
			EmployeeUtility.showNetSalary(c1);
		}

	}

}
