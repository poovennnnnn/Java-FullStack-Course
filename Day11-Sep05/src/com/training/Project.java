package com.training;

import java.util.Objects;

public class Project {
	
	private Integer projectId;
	private String projectName;

	public Project() {
		// TODO Auto-generated constructor stub
	}

	public Project(Integer projectId, String projectName) {
		super();
		this.projectId = projectId;
		this.projectName = projectName;
	}

	public Integer getProjectId() {
		return projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	@Override
	public int hashCode() {
		return Objects.hash(projectId, projectName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		return Objects.equals(projectId, other.projectId) && Objects.equals(projectName, other.projectName);
	}

	@Override
	public String toString() {
		return "Project [projectId=" + projectId + ", projectName=" + projectName + "]";
	}
	
	

}
