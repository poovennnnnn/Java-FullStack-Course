package com.pooven.service;

import com.pooven.dao.StudentDao;

import com.pooven.dto.Student;

public class StudentServiceImpl implements StudentService {
	
	private StudentDao studentDao;

	public StudentDao getStudentDao() {
		return studentDao;
	}

	public void setStudentDao(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	@Override
	public void addRecord(Student student) {
		studentDao.addRecord(student);
	}

	@Override
	public Student findRecordbyId(int id) {
		return studentDao.findRecordbyId(id);
	}

	@Override
	public Student updateById(int id, Student student) {
		return studentDao.updateById(id, student);
	}

	@Override
	public void deleteRecord(int id) {
		studentDao.deleteRecord(id);
	}
	

}
