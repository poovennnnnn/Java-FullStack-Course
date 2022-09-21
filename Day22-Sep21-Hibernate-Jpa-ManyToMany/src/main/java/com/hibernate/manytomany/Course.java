package com.hibernate.manytomany;

import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="course1")
public class Course {
	
	@Id
	private int courseId;
	private String courseName;
	private int duration;
	
	@ManyToMany(targetEntity = Student.class)
	private List<Student> studentList;

	public Course() {
		// TODO Auto-generated constructor stub
	}

	public Course(int courseId, String courseName, int duration, List<Student> studentList) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.duration = duration;
		this.studentList = studentList;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(courseId, courseName, duration, studentList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Course other = (Course) obj;
		return courseId == other.courseId && Objects.equals(courseName, other.courseName) && duration == other.duration
				&& Objects.equals(studentList, other.studentList);
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", courseName=" + courseName + ", duration=" + duration
				+ ", studentList=" + studentList + "]";
	}
	
	

}
