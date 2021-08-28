package com.techment;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RetriveClient {

	public static void main(String[] args) {

		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
	SessionFactory factory=configuration.buildSessionFactory();
	Session session=factory.openSession();

	Transaction tx = session.beginTransaction();

	Student student=session.load(Student.class,new Integer(2) );
System.out.println("id"+student.getStudentId()+"Name"+student.getName()+"dept"+student.getDept());
	

	tx.commit();

	session.close();

	}

}
