package com.hibernate.table.perclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaTablePerClassMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		PermanentEmployee p1 = new PermanentEmployee();
		p1.setEmpId(111);
		p1.setEmpName("P1");
		p1.setMonthlySalary(1000);
		
		ContractEmployee c1 = new ContractEmployee();
		c1.setEmpId(222);
		c1.setEmpName("C1");
		c1.setHourlyRate(100);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		em.persist(p1);
		em.persist(c1);
		et.commit();
		
		System.out.println("Records added");

		
	}

}
