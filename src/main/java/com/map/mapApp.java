package com.map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class mapApp {

	public static void main(String[] args) {
		
		
		System.out.println("My program started...");
		//get configuration object
		Configuration cfg=new Configuration();
		//get configure file
		cfg.configure("hibernate.cfg.xml");
		//get sessionfactory and build sessionfactory
		SessionFactory factory=cfg.buildSessionFactory();
		
		//get Question1 object
		Question q1=new Question();
		q1.setQuestionId(123);
		q1.setQuestion("What is java ?");
		//get answer object
		Answer ans = new Answer();
		ans.setAnswerId(566);
		ans.setAnswer("Java is best");
		ans.setQuestion(q1);
		q1.setAnswer(ans);
		
		//get session object and open session object
		
		Session session =factory.openSession();
		// get transction object and begin the transction
		Transaction tx = session.beginTransaction();
		session.save(q1);
		session.save(ans);
		tx.commit();
		Question question =(Question) session.load(Question.class, 123);
		System.out.println(question.getQuestion()+":"+question.getAnswer());
		
		session.close();
		factory.close();

	}

}
