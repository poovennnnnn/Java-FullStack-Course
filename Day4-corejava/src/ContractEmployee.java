
public class ContractEmployee extends Employee {
	

	
	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String empName, double grossSalary) {
		super(empId, empName, grossSalary);
		// TODO Auto-generated constructor stub
	}

	public void showNetSalaryAfterDeductions() {
		
		int deductions = 500;
		int netSalary = (int) getGrossSalary() - deductions;
		
		System.out.println("Gross salary = "+ getGrossSalary());
		System.out.println("Deductions = "+deductions);
		System.out.println("Net Salary = "+netSalary);

	}
	
	
	

}
