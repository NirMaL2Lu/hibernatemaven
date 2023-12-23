package com.listmapping.xml;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx = session.beginTransaction();
		
		 ArrayList<String> list1=new ArrayList<String>();    
		    list1.add("Java is a programming language");    
		    list1.add("Java is a platform");    
		        
		    ArrayList<String> list2=new ArrayList<String>();    
		    list2.add("Servlet is an Interface");    
		    list2.add("Servlet is an API");    
		        
		    Question1 question1=new Question1(); 
		    question1.setQid(11);
		    question1.setqName("What is Java?");    
		    question1.setAnswers(list1);    
		        
		    Question1 question2=new Question1(); 
		    question2.setQid(22);
		    question2.setqName("What is Servlet?");    
		    question2.setAnswers(list2);    
		    
		    session.save(question1);
		    session.save(question2);

		
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Sucess...");
		

	}

}
