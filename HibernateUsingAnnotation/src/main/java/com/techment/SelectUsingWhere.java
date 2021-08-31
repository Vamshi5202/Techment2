package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SelectUsingWhere {

	public static void main(String[] args) {

		
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();
		Query query=session.createQuery("select s from Student s where s.dept=:x");
	
		query.setParameter("x", "ece");
		
	List<Student> list=query.getResultList();
		
		list.forEach(s->System.out.println(s.getStudentId()+" "+s.getName()));
		
		session.close();
		sessionFactory.close();
	}

}
