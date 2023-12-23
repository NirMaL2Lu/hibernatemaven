package com.hql;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.hibernate.Student;

public class HQLExample {

	public static void main(String[] args) {
		
		 System.out.println( "My program started....!" );
	        Configuration cfg = new Configuration();
	        cfg.configure("hibernate.cfg.xml");
	        SessionFactory factory=cfg.buildSessionFactory();
	        Session session=factory.openSession();
	        Transaction tx=session.beginTransaction();
	        //HQL query
	        //select query
	        String query = "from Student where city='kdp'";
//	        single result(unique)
//	        Multiple result-list
	        Query q = session.createQuery(query);
	        List<Student> list = q.list();
	        
//	        multiple result
	        for (Student student : list) {
				System.out.println(student.getName()+" : "+student.getCity()+" : "+student.getCertificate());
			}
	        
	        //delete query
	        
			/*
			 * String query2="delete from Student as s where s.city=:c"; Query
			 * q1=session.createQuery(query2); 
			 * q1.setParameter("c","kdp"); int r =
			 * q1.executeUpdate(); 
			 * System.out.println("deleted"); 
			 * System.out.println(r+ " row deleted.");
			 */
	        
	        //update query
			/*
			 * String query3="update Student as s set s.city=:c where s.name=:n"; Query
			 * q2=session.createQuery(query3); 
			 * q2.setParameter("c", "Delhi");
			 * q2.setParameter("n", "Nirmal");
			 *  int r = q2.executeUpdate();
			 * System.out.println(r+" row updated");
			 */
	        
	        	
//	       String query4="select s.sName,s.sId,c.courses from Student1 as s INNER JOIN s.courses as c";
	        String query4="select s.sId,c.courses from Student1 as s inner join s.courses as c";
	 	   Query q3=session.createQuery(query4);
	 	   List<Object[]> list2 = q3.getResultList();
	 	   for (Object[] arr : list2) {
	 		   System.out.println(Arrays.toString(arr));
			
		}
	        
	        tx.commit();
	         
	        
	        
	        
	        session.close();
	        factory.close();
	        
		
	}
	
}
