package com.criteria;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.hibernate.Student;

public class CriteriaDemo {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session=factory.openSession();
		
		@SuppressWarnings("deprecation")
		Criteria cr =session.createCriteria(Student.class);
//		cr.add(Restrictions.eq("certificate.course", "java"));
//		cr.add(Restrictions.lt("id", 5));
//		cr.add(Restrictions.gt("id", 5));
//		cr.add(Restrictions.like("certificate.course", "w%"));
		cr.add(Restrictions.ilike("certificate.course", "web%"));
		cr.add(Restrictions.isNull("name"));
		List<Student> list=cr.list();
		for (Student student : list) {
			System.out.println(student);
		}
		
		
		session.close();
		factory.close();

	}

}
