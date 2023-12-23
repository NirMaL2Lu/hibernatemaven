package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class fetchData {

	public static void main(String[] args) {
		System.out.println("My program started....!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		// call openSession from session object help of factory reference
		Session session = factory.openSession();
		// get transaction
		Transaction tx = session.beginTransaction();
		// fetch student data

//		  Student student =(Student)session.get(Student.class, 1);
//		  System.out.println(student);
//		  Student student1 =(Student)session.get(Student.class, 1);
//		  System.out.println(student1);

		
		  Student student1 =(Student)session.load(Student.class, 1);
		  Student student2 =(Student)session.load(Student.class, 1);
		  System.out.println(student1);
		  //fetch address details 
		 // Adress ad = (Adress)session.load(Adress.class, 1); System.out.println(ad);
		 // System.out.println(ad.getStreet()+" : "+ad.getCity());
		 

		session.close();
		factory.close();

	}

}
