package com.pooven.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

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
	public Student findRecordbyId(int id) {

		manager = getFactory().createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Student temp = manager.find(Student.class,id);
		transaction.commit();
		return temp;
		
	}

	@Override
	public Student updateById(int id,Student student) {
		manager = getFactory().createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Student temp = manager.find(Student.class,id);
		temp.setAge(student.getAge());
		temp.setPassport(student.getPassport());
		temp.setStudentName(student.getStudentName());
		temp.setCollegeId(student.getCollegeId());
		manager.persist(temp);
		transaction.commit();
		return temp;
		
		
	
	}

	@Override
	public void deleteRecord(int id) {

		manager = getFactory().createEntityManager();
		transaction = manager.getTransaction();
		transaction.begin();
		Student temp = manager.find(Student.class,id);
		manager.remove(temp);
		transaction.commit();
		System.out.println("Deleted..");
	}

	

}
