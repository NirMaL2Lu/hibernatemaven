package com.state;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Certificate;
import com.hibernate.Student;

public class ObjectStateApp {

	public static void main(String[] args) {
		
		//practical session of object state
		//Transient
		//Persistent
		//Detached
		//Removed
		System.out.println("My program started....!");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create object of student
		Student st= new Student();
		st.setId(2);
		st.setName("Peter");
		st.setCity("Delhi");
		st.setCertificate(new Certificate("Python","2 Months"));
		//student transient state
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(st);
		//persistante state
		st.setName("Allen");
		/*
		 * here the Name 'Allen' will be set to the db insted of 'Peter' because u can
		 * change the value of properties at the persistente state but after commit u cant change the value of 
		 * properties
		 * 
		 */
		tx.commit();
		//persistante state = database + session
		session.delete(st);
		// remove state
		/* after you called delete() through session object it delete the data
		 * from db but data is associated with session.
		 * 
		 */
		session.close();
		//Detached State
		st.setName("Joker");
		/* but here after the close of session u can't save any data into the db
		 * because session is detached from db so it is called detached state.  
		 */
		factory.close();

	}

}
