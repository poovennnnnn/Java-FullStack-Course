package com.pooven.service;

import com.pooven.dto.Student;

public interface StudentService {
	public void addRecord(Student student);
	public Student findRecordbyId(int id);
	public Student updateById(int id,Student student);
	public void deleteRecord(int id);


}
