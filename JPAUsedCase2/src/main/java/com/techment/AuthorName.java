package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AuthorName {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query=em.createQuery("select p from Book p where p.id=12");
		
		Object id=query.getResultList();
		Query query2=em.createQuery("select p from Author p where p.id=id");
		List<Author> author=query2.getResultList();
		
		for(Author a:author) {
			System.out.println("Author Name "+a.getName());
			
		}
		em.getTransaction().commit();
		em.close();
		
	}

	}


