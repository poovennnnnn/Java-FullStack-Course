
public abstract class Employee {
	
	private int empId;
	private String empName;
	private double grossSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double grossSalary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.grossSalary = grossSalary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getGrossSalary() {
		return grossSalary;
	}
	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}
	
	
	public void printEmployee() {
		System.out.println("Employee Id :"+empId);
		System.out.println("Employee Name: "+empName);
		System.out.println("Gross salary :"+grossSalary);
	}
	
	public abstract void showNetSalaryAfterDeductions();
	
	


}
