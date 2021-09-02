package com.test1.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OnetoOneClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Student student1=new Student();
		student1.setName("murthy");
		 Student student2=new Student();
		 student2.setName("jaanu");
		 em.persist(student1);
		 em.persist(student2);
		 
		 Library2 library1=new Library2("java",student1);
		 Library2 library2=new Library2("sql",student2);
		 em.persist(library1);
		 em.persist(library2);
		 
		 em.getTransaction().commit();
		 em.close();
		
	}

}
