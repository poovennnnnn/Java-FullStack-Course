package com.hibernate.manytomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class JpaManyToMany {
	

	public static void main(String[] args) {
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 Student s1 = new Student(101, "stud1", 20, null);
		 Student s2 = new Student(102, "stud2", 22, null);
		 Student s3 = new Student(103, "stud3", 24, null);
		 
		 et.begin();
		 em.persist(s1);
		 em.persist(s2);
		 em.persist(s3);
		 
		 List<Student> list1 = new ArrayList<>();
		 list1.add(s1);
		 list1.add(s2);
		 list1.add(s3);
		 
		 List<Student> list2 = new ArrayList<>();
		 list2.add(s1);
		 list2.add(s2);
		 list2.add(s3);
		 
		 Course c1 = new Course(501, "java", 10, list1);
		 Course c2 = new Course(504, "angular", 10, list2);
		 
		 em.persist(c1);
		 em.persist(c2);
		 
		 et.commit();
		 
		 System.out.println("Records added");
 
	}
}
