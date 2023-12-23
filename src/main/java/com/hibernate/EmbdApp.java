package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbdApp {
	public static void main(String[] args) {
		System.out.println("My program started...");
		//get configuration object
		Configuration cfg=new Configuration();
		//get configure file
		cfg.configure("hibernate.cfg.xml");
		//get sessionfactory and build sessionfactory
		SessionFactory factory=cfg.buildSessionFactory();
		//get session and open the session for transction
		
		//get student object
		Student st=new Student();
		st.setId(1);
		st.setName("Nirmal");
		st.setCity("kdp");
		//create certificate obj for set certifite properties
		Certificate cer=new Certificate();
		cer.setCourse("Java");
		cer.setDuration("2 Months");
		st.setCertificate(cer);
		Session session=factory.openSession();
		//begin the transction
		Transaction tx = session.beginTransaction();
		
		//call save method from session
		session.save(st);
		tx.commit();
		System.out.println(st);
		//close objects
		session.close();
		factory.close();
		
	}
	
}
