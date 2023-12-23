package com.sql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;

import com.hibernate.Student;

public class SQLExample {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session s=factory.openSession();
		
		NativeQuery nq = s.createSQLQuery("select * from Student");
		List<Object[]> list = nq.list();
			
		for (Object[] student : list) {
//			System.out.println(Arrays.toString(student));
			System.out.println(student[3]+" : "+student[4]);
		}
		
		s.close();
		factory.close();
	}

}
