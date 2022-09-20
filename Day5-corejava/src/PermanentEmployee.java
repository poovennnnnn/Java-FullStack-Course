
public class PermanentEmployee extends Employee{
	
	int helathInsurance = 100;
	int incomeTax = 200;
	int carLoan = 400;
	
	public int getHelathInsurance() {
		return helathInsurance;
	}

	public void setHelathInsurance(int helathInsurance) {
		this.helathInsurance = helathInsurance;
	}

	public int getIncomeTax() {
		return incomeTax;
	}

	public void setIncomeTax(int incomeTax) {
		this.incomeTax = incomeTax;
	}

	public int getCarLoan() {
		return carLoan;
	}

	public void setCarLoan(int carLoan) {
		this.carLoan = carLoan;
	}


	
	
	public PermanentEmployee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PermanentEmployee(int empId, String empName, double grossSalary) {
		super(empId, empName, grossSalary);
		// TODO Auto-generated constructor stub
	}


	public void showNetSalaryAfterDeductions() {
	int deductions = getCarLoan() + getEmpId() + getHelathInsurance();
	int netSalary = (int) getGrossSalary() - deductions;
	
	System.out.println("Gross salary = "+getGrossSalary());
	System.out.println("Deductions = "+deductions);
	System.out.println("Net Salary = "+netSalary);


}

}
