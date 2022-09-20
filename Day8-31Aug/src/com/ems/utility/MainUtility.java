package com.ems.utility;

import java.util.Scanner;

import com.ems.dto.Employee;
import com.ems.service.EmployeeServiceImpl;

public class MainUtility {

	
	public static void start() {
		
		EmployeeServiceImpl ems = new EmployeeServiceImpl();
		Employee e = null;
		Scanner sc = new Scanner(System.in);
       
	    boolean bool = true;
		do {
			 System.out.println(" 1. Find Employee \n 2. Show all Employee \n 3. Get Employee Salary \n 4. Update Employee \n 5. Update Employee Salary");
		        System.out.println("Enter 10 to  exit the Application");
			System.out.println("Choose your option :");
			int x = sc.nextInt();
			switch(x) {
			
			case 1:{
				System.out.println("TO Find a Employee Enter a Employee Id :");
				int employeeId = sc.nextInt();
				e = ems.findEmployee(employeeId);
				System.out.println(e);
				break;
				
			}
			case 2:{
				ems.showAllEmployee();
				break;
			}
			
			case 10:{
				bool = false;
				sc.close();
				System.out.println("Exit");
				break;
			}
			default:{
				bool = false;
				System.out.println("exitedddddd");
				sc.close();
				break;
			}
			
			}
			
		}while(bool);
	}

}
