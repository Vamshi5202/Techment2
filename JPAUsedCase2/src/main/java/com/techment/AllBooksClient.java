package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AllBooksClient {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query=em.createQuery("select b from Book b");
		List<Book> books=query.getResultList();
		
		for(Book b:books) {
			System.out.println("BOOK ID "+b.getId());
			System.out.println("BOOK NAME "+b.getTitle());
			System.out.println("BOOK PRICE "+b.getPrice());
			
		}
		em.getTransaction().commit();
		em.close();
		
	}

}
