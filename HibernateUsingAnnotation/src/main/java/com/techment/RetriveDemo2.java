package com.techment;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RetriveDemo2 {

	public static void main(String[] args) {

		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Query<Student> query=session.createQuery("select s.studentId,s.name from Student s");
		List<Student> st=query.list();
		/*for(Object s:st) {
			Student student=(Student) s;
		System.out.println(student.getName()+" "+student.getStudentId());	
		}*/
		
		
		session.close();
		sessionFactory.close();
	}

}
