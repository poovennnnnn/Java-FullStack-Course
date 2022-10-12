package com.pooven.service;

import com.pooven.dao.StudentDao;

import com.pooven.dto.Student;

public class StudentService {
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void addRecord(Student student) {
		studentDao.addRecord(student);
	}
	
	public void findAllRecord() {
		studentDao.findAllStudent();
	}

}
