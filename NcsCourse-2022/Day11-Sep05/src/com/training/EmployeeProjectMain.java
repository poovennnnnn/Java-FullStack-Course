package com.training;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class EmployeeProjectMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Employee,Project> m = new TreeMap<>();
	
		m.put(new Employee(101,"Scott"), new Project(101, "WebDevelopment"));
		m.put(new Employee(102,"harry"), new Project(102, "ProductDevelopment"));
		m.put(new Employee(103,"potter"), new Project(103, "Employee management"));
		m.put(new Employee(104,"thor"), new Project(104, "Backend"));
		
		
//		System.out.println(m.get(new Employee(101,"Scott")));
		
		Set<Map.Entry<Employee,Project>> entries = m.entrySet();
		
		for(Map.Entry<Employee, Project> x: entries) {
//			System.out.println(x.getKey()+"::::::::::::::"+ x.getValue());
		}
		
		//
		List<Employee> list1 = Arrays.asList(new Employee(101,"Scott"),new Employee(102,"harry"),new Employee(103,"potter"));
		List<Employee> list2 = Arrays.asList(new Employee(101,"Scott"));
		Map<Project,List<Employee>> m1 = new HashMap<>();
		m1.put(new Project(101, "WebDevelopment"), list1);
		m1.put(new Project(102, "ProductDevelopment"), list2);
		
		Set<Map.Entry<Project, List<Employee>>> x = m1.entrySet();
		
		for(Map.Entry<Project, List<Employee>> e: x) {
			System.out.println(e.getKey());
			
			
		for(Employee emp: e.getValue()) {
		
			
			System.out.println();
				
			}
			
			
			
		}
		
		
		

		
	}

}

