package com.map2;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class map2App {

	public static void main(String[] args) {
		
		System.out.println("My program started...");
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		//create objects
		Employee e1=new Employee();
		Employee e2=new Employee();
		
//		e1.setEmpId(77);
//		e1.seteName("Manu");
//		
//		e2.setEmpId(66);
//		e2.seteName("Sonu");
//		
//		Project p1=new Project();
//		Project p2=new Project();
//		
//		p1.setProjectId(333);
//		p1.setProjectName("Hospital Management");
//		
//		p2.setProjectId(444);
//		p2.setProjectName("SMS App");
//		
//		List<Employee> employees=new ArrayList<Employee>();
//		List<Project> projects=new ArrayList<Project>();
//		
//		employees.add(e1);
//		employees.add(e1);
//		
//		projects.add(p1);
//		projects.add(p2);
//		
//		e1.setProjects(projects);
//		e2.setProjects(projects);
//		
//		p1.setEmployees(employees);
//		p2.setEmployees(employees);
		
		Session session = factory.openSession();
		Transaction tx =session.beginTransaction();
		
//		session.save(e1);
//		session.save(e2);
//		session.save(p1);
//		session.save(p2);
//		tx.commit();
		
		Employee employee = session.get(Employee.class, 77);
		System.out.println(employee.geteName()+" : "+employee.getEmpId());
		for (Project pro : employee.getProjects()) {
			System.out.println(pro.getProjectName());
		}
		System.out.println(employee.getEmpId());
		System.out.println(employee.geteName());
		System.out.println(employee.getProjects().size());
		
		
		session.close();
		factory.close();
	}

}
