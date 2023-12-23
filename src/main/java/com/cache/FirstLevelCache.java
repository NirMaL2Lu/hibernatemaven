package com.cache;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernate.Student;

public class FirstLevelCache {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		// first level cache provied default in hibernate  
		Student st=s.get(Student.class, 6);
		System.out.println(st);
		

		Student st1=s.get(Student.class, 6);
		System.out.println(st1);
		System.out.println(s.contains(st1));
		s.close();
		
		factory.close();
		
		

	}

}
