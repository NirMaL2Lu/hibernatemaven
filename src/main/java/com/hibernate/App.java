package com.hibernate;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "My program started....!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory=cfg.buildSessionFactory();
//        System.out.println(factory);
//        System.out.println(factory.isOpen());
//        System.out.println(factory.isClosed());
        
//        student object
        
        Student st = new Student();
        st.setId(101);
        st.setName("Bimal");
        st.setCity("kdp");
        System.out.println(st);
        
//        adress object
        Adress ad = new Adress();
        ad.setAdressId(101);
        ad.setStreet("new park area");
        ad.setCity("Badpal chowk");
        ad.setOpen(true);
        ad.setX(19);
        ad.setAddDate(new Date());
//        reading image
        FileInputStream fis = new FileInputStream("src/main/java/default.png");
        byte [] data = new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        System.out.println(ad);
        //call openSession from session object help of factory reference
        Session session = factory.openSession();
        //get transaction
        Transaction tx = session.beginTransaction();
        //session.save(st);
//        session.update(st);
        session.save(ad);
        tx.commit();
        session.close();
        factory.close();
        
    }
}
