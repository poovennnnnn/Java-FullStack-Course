package com.hibernate.client;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.hibernate.dto.Student;

public class StudentMain1 {

	public static void main(String[] args) {
		
//		jpqlSimpleSelect();
		jpqlSimpleSelectFewColumns();
		
		

	}
	
	public static void jpqlSimpleSelect() {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 Query query = em.createQuery("From  com.hibernate.dto.Student s");
		 
		 List<Student>  studentList = query.getResultList();
		 
		 studentList.forEach( System.out::println );
 		 
	}
	
	
	public static void jpqlSimpleSelectFewColumns() {
		
		 EntityManagerFactory emf = Persistence.createEntityManagerFactory("test1");
		 EntityManager em = emf.createEntityManager();
		 Query query = em.createQuery("SELECT s.studentId,s.studentName From  com.hibernate.dto.Student s");
		 
		 List<Object[]>  studentList = query.getResultList();
		 
		 studentList.forEach(obj -> {
			 System.out.println(obj[0]+"--"+obj[1]);
		 });
		 
	}


}
