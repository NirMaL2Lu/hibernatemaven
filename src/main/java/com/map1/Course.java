package com.map1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private int courseid;
	private String courses;
	@ManyToOne
	private Student1 student1;
	
	public Course() {
		
	}
	

	public Course(int courseid, String courses) {
		super();
		this.courseid = courseid;
		this.courses = courses;
	}


	public Course(int courseid, String courses, Student1 student1) {
		super();
		this.courseid = courseid;
		this.courses = courses;
		this.student1 = student1;
	}

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCourses() {
		return courses;
	}

	public void setCourses(String courses) {
		this.courses = courses;
	}

	public Student1 getStudent() {
		return student1;
	}

	public void setStudent(Student1 student1) {
		this.student1 = student1;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courses=" + courses + ", student=" + student1 + "]";
	}
	
	
	
	
}
