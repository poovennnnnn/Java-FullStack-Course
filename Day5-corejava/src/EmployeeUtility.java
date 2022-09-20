
public class EmployeeUtility {

	public static void showNetSalary(Employee e) {
		e.printEmployee();
		
		if(e instanceof PermanentEmployee) {
			PermanentEmployee p = (PermanentEmployee) e;
			System.out.println("Income tax ="+ p.getIncomeTax());
			System.out.println("Car loan = "+p.getCarLoan());
			System.out.println("Health Insurance ="+p.getHelathInsurance());
		}else if(e instanceof ContractEmployee) {
			ContractEmployee c = (ContractEmployee) e;
			System.out.println("Fixed Deductions = "+c.getFixedDeduction());
		}
		
		
		
		e.showNetSalaryAfterDeductions();
		
	}
}
