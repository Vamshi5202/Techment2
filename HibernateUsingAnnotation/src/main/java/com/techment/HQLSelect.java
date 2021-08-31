package com.techment;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HQLSelect {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();

		Session session = sessionFactory.openSession();

		Query<Student> query = session.createQuery("select s from Student s");

		List<Student> studentList = query.list();

		studentList.forEach(System.out::println);
		studentList.forEach(s->System.out.println(s.getDept()+""+s.getStudentId()+""+s.getName()));
		
		System.out.println("select only specific colom");
		Query<Student> query2=session.createQuery("select s.studentId,s.name from Student s");
		List<Student> students=query2.list();
		//students.forEach(System.out::println);
		Iterator it=students.iterator();
		while(it.hasNext()) {
			
			Object Obj[]=(Object[]) it.next();
			//Student s=(Student)studentObj;
			//System.out.println(s.getStudentId()+" "+s.getName());
		System.out.println(Obj[0]+" "+Obj[1]);
		
		}
		
		session.close();
		sessionFactory.close();

	}

}
