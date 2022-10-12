package com.pooven.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.pooven.dto.Student;

public class StudentDaoImpl implements StudentDao {
	private EntityManagerFactory factory;
	private EntityManager manager;
	private EntityTransaction transaction;

	public EntityManagerFactory getFactory() {
		return factory;
	}

	public void setFactory(EntityManagerFactory factory) {
		this.factory = factory;
	}


	@Override
	public void addRecord(Student student) {

		manager = getFactory().createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(student);
		transaction.commit();
		System.out.println("Record Added....");

	}

	@Override
	public void findAllStudent() {


		manager = getFactory().createEntityManager();
		transaction = manager.getTransaction();

		Query query = manager.createQuery("From  com.pooven.dto.Student s"); //Method 1
	
		List<Student>  studentList = query.getResultList();

//		studentList.forEach( System.out::println );

		CriteriaBuilder c = manager.getCriteriaBuilder();   // method 2
		CriteriaQuery<Student> q = c.createQuery(Student.class);
		Root<Student> root = q.from(Student.class);
		TypedQuery<Student> tq = manager.createQuery(q);
		List<Student> studentList1 = tq.getResultList();
		studentList1.forEach( System.out::println );

		
	}



}
