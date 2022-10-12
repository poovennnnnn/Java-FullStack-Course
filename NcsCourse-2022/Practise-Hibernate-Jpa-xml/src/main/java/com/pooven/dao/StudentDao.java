package com.pooven.dao;

import com.pooven.dto.Student;

public interface StudentDao {
	public void addRecord(Student student);
	public Student findRecordbyId(int id);
	public Student updateById(int id,Student student);
	public void deleteRecord(int id);

}
