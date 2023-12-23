package com.map1;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Student1 {
	
	@Id
	private int sId;
	private String sName;
	@OneToMany(mappedBy = "student1",fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	private List<Course> courses;

	public Student1() {
		
	}

	public Student1(int sId, String sName, List<Course> courses) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.courses = courses;
	}

	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}

	@Override
	public String toString() {
		return "Student1 [sId=" + sId + ", sName=" + sName + ", courses=" + courses + "]";
	}
	
	
}

