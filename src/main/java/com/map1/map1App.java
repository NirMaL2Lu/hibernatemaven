package com.map1;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map1App {

	public static void main(String[] args) {

		System.out.println("My program started...");
		// get configuration object
		Configuration cfg = new Configuration();
		// get configure file
		cfg.configure("hibernate.cfg.xml");
		// get sessionfactory and build sessionfactory
		SessionFactory factory = cfg.buildSessionFactory();

		// get student1 object
		Student1 st1 = new Student1();
		st1.setsId(103);
		st1.setsName("tulu");
		// creating courses object
		Course cs1 = new Course();
		// 1st course details
		cs1.setCourseid(04);
		cs1.setCourses("Spring");
		cs1.setStudent(st1);
		// 2nd course details
		Course cs2 = new Course();
		cs2.setCourseid(05);
		cs2.setCourses("mySQL");
		cs2.setStudent(st1);
		// 3nd course details
		Course cs3 = new Course();
		cs3.setCourseid(06);
		cs3.setCourses("SQL");
		cs3.setStudent(st1);

		ArrayList<Course> courses = new ArrayList<Course>();
		courses.add(cs1);
		courses.add(cs2);
		courses.add(cs3);

		st1.setCourses(courses);

		// get session objet and open session object
		Session session = factory.openSession();
		// get transction object and begintransaction
		Transaction tx = session.beginTransaction();
//		session.save(st1);
//		session.save(cs1);
//		session.save(cs2);
//		session.save(cs3);
//		tx.commit();
		
		  Student1 s = session.get(Student1.class, 103);
//		  System.out.println("Name : "+s.getsName()); 
//		  System.out.println("Courses : ");
//		     for (Course cs :s.getCourses()) {
//		  System.out.println(cs.getCourses());
//		}
		 System.out.println(s.getsId());
		 System.out.println(s.getsName());
//		 System.out.println(s.getCourses().size());

		// close the objects
		session.close();
		factory.close();

	}

}
