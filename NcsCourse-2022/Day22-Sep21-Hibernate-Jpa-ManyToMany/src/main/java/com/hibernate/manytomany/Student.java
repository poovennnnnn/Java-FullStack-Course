package com.hibernate.manytomany;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="student1")
public class Student {

	@Id
	private int snumber;
	private String sname;
	private int age;
	
	
	@ManyToMany(targetEntity = Course.class)
	private List<Course> course;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int snumber, String sname, int age, List<Course> course) {
		super();
		this.snumber = snumber;
		this.sname = sname;
		this.age = age;
		this.course = course;
	}
	public int getSnumber() {
		return snumber;
	}
	public void setSnumber(int snumber) {
		this.snumber = snumber;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public List<Course> getCourse() {
		return course;
	}
	public void setCourse(List<Course> course) {
		this.course = course;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, course, sname, snumber);
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
		return age == other.age && Objects.equals(course, other.course) && Objects.equals(sname, other.sname)
				&& snumber == other.snumber;
	}
	@Override
	public String toString() {
		return "Student [snumber=" + snumber + ", sname=" + sname + ", age=" + age + ", course=" + course + "]";
	}
	
	
	

	
}
