package com.cascade;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.map1.Course;
import com.map1.Student1;

public class CascadingDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		Student1 st1=new Student1();
		st1.setsId(108);
		st1.setsName("Natu");
		
		Course c1=new Course(12, "Spring",st1);
		Course c2=new Course(14, "Spring MVC",st1);
		Course c3=new Course(13, "Spring BOOT",st1);
		Course c4=new Course(16, "Spring JDBC", st1);
		List<Course> list= new ArrayList<Course>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		st1.setCourses(list);
		Transaction tx=s.beginTransaction();
		s.save(st1);
		tx.commit();
		
		
		
		
		s.close();
		factory.close();
	}
}
