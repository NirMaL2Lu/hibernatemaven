package com.map2;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Employee {
	@Id
	private int empId;
	private String eName;
	@ManyToMany
	@JoinTable(name = "emp_project_common" ,
	joinColumns = {@JoinColumn(name="eid")},
	inverseJoinColumns = {@JoinColumn(name="pid")})
	private List<Project> projects;
	
	public Employee() {
		
	}

	public Employee(int empId, String eName, List<Project> projects) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.projects = projects;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public List<Project> getProjects() {
		return projects;
	}

	public void setProjects(List<Project> projects) {
		this.projects = projects;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ", projects=" + projects + "]";
	}
	
	
}
