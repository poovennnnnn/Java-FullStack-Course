package com.hibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class JpaManytToOne {

	public static void main(String[] args) {
//		addReords();
//		deleteReord();

	}

	public static void addReords() {

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 
		 College college = new College(501,"College501");
		 Student s1 = new Student(5011, "stud5011", 18, 50111, 501, college);
		 Student s2 = new Student(5012,"Stud5012", 18, 50112, 501,college);
		 Student s3 = new Student(5013,"Stud5013", 19, 50113, 501,college);
		 
		 
		 EntityTransaction et = em.getTransaction();
		 et.begin();
		 em.persist(s1);
		 em.persist(s2);
		 em.persist(s3); 
		 et.commit();
		 System.out.println("record added");
	}
	
}
