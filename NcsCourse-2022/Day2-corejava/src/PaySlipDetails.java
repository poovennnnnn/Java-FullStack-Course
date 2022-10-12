
public class PaySlipDetails {
	
	String employeeName;
	int employeeId , profidenttFund,healthInsurance,carLoanEmi;
	double grossSalary , netSalary;
	
	void paySlipCalculate(String employeeName, int employeeId,int healthInsurance,int carLoan,double grossSalary) {
		
		
		System.out.println("Employee name ="+employeeName);

		System.out.println("Employee Id ="+employeeId);
		
		double healthDeduct = grossSalary - (grossSalary * healthInsurance/100);
		
		double deductions = healthDeduct + carLoan;
		
		double netSalary = grossSalary - deductions;
		
		System.out.println("Gross salary is ="+ grossSalary);
		System.out.println("Deduction is "+ deductions);
		System.out.println("Netsalary is ="+netSalary);
		
		
		
		
		
	}
	
	
	
	

}
