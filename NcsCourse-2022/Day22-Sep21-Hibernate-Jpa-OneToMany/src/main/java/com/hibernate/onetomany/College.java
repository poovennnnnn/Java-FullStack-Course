package com.hibernate.onetomany;

import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class College {
	
	@Id
	@Column(name="college_id")
	private int collegeId;
	
	@Column(name="college_name")
	private String collegeName;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="college_id")
	private List<Student> studentList;

	public College() {
	}

	public College(int collegeId, String collegeName, List<Student> studentList) {
		super();
		this.collegeId = collegeId;
		this.collegeName = collegeName;
		this.studentList = studentList;
	}

	public int getCollegeId() {
		return collegeId;
	}

	public void setCollegeId(int collegeId) {
		this.collegeId = collegeId;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	public List<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
	}

	@Override
	public int hashCode() {
		return Objects.hash(collegeId, collegeName, studentList);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		College other = (College) obj;
		return collegeId == other.collegeId && Objects.equals(collegeName, other.collegeName)
				&& Objects.equals(studentList, other.studentList);
	}

	@Override
	public String toString() {
		return "College [collegeId=" + collegeId + ", collegeName=" + collegeName + ", studentList=" + studentList
				+ "]";
	}
	
	

}
