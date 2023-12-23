package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HQLPagination {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
			Query q1 = session.createQuery("from Student");
		
			q1.setFirstResult(0);
			q1.setMaxResults(6);
			List<Student> list = q1.list();
			for (Student s1 : list) {
				System.out.println(s1.getId()+" : "+s1.getName()+" : "+s1.getCity());
			}
	}

}
