package com.hibernate.client;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.onetomany.College;
import com.hibernate.onetomany.Student;

public class JpaOneToMany {

	public static void main(String[] args) {
//		addReords();
		deleteReord();

	}

	public static void addReords() {

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 
		 College c1 = new College(501,"College6", new ArrayList<>());
		 
		 Student s1 = new Student(5011,"Stud5011", 18, 50111, 501);
		 Student s2 = new Student(5012,"Stud5012", 18, 50112, 501);
		 Student s3 = new Student(5013,"Stud5013", 19, 50113, 501);
		 
		 c1.getStudentList().add(s1);
		 c1.getStudentList().add(s2);
		 c1.getStudentList().add(s3);
		 
		 EntityTransaction et = em.getTransaction();
		 et.begin();
		 em.persist(c1);
		 et.commit();
		 System.out.println("record added");
	}
	
	public static void deleteReord() {

		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 EntityTransaction et = em.getTransaction();
		 
		 et.begin();
		 College temp = em.find(College.class,501);
		 em.remove(temp);
		 et.commit();
		 
		 System.out.println("record deleted");
	}
}
