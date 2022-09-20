
public class ContractEmployee extends Employee {
	
	private int fixedDeduction;
	

	
	public int getFixedDeduction() {
		return fixedDeduction;
	}

	public void setFixedDeduction(int fixedDeduction) {
		this.fixedDeduction = fixedDeduction;
	}

	public ContractEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ContractEmployee(int empId, String empName, double grossSalary) {
		super(empId, empName, grossSalary);
		// TODO Auto-generated constructor stub
	}

	public void showNetSalaryAfterDeductions() {
		
		int deductions = fixedDeduction;
		int netSalary = (int) getGrossSalary() - deductions;
		
		System.out.println("Gross salary = "+ getGrossSalary());
		System.out.println("Deductions = "+deductions);
		System.out.println("Net Salary = "+netSalary);

	}
	
	
	

}
