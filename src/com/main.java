package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class main {

	public static void main(String[] args) {
		Configuration config=new AnnotationConfiguration();
		config.configure("hibernate.cfg.xml");
		SessionFactory factory=config.buildSessionFactory();
		Session ses=factory.openSession();
		Student s=new Student(123,"Tushar","Nagpur",45);
		ses.save(s);
		Transaction tx=ses.beginTransaction(); 
		tx.commit();
		System.out.println("success");

	}

}
