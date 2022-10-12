package com.pooven.dto;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student")
public class Student {

	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="student_name")
	private String studentName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="passport")
	private int passport;
	
	@Column(name="college_id")
	private int collegeId;
	
	
	
	public Student() {
	}



	public Student(int studentId, String studentName, int age, int passport, int collegeId) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
		this.passport = passport;
		this.collegeId = collegeId;
	}



	public int getStudentId() {
		return studentId;
	}



	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getPassport() {
		return passport;
	}



	public void setPassport(int passport) {
		this.passport = passport;
	}



	public int getCollegeId() {
		return collegeId;
	}



	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}



	@Override
	public int hashCode() {
		return Objects.hash(age, collegeId, passport, studentId, studentName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return age == other.age && collegeId == other.collegeId && passport == other.passport
				&& studentId == other.studentId && Objects.equals(studentName, other.studentName);
	}



	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", passport="
				+ passport + ", collegeId=" + collegeId + "]";
	}

	
}
