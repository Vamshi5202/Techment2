package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class ByAuthorName {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
      Query query=em.createQuery("select b from Author b where b.name='shesham '");
      Object id=query.getSingleResult();
      Query query2=em.createQuery("select d from Book e JOIN  e.Author d",Author.class);
		List<Book> books = query2.getResultList();

		for (Book b : books) {
			System.out.println("BOOK ID " + b.getId());
			System.out.println("BOOK NAME " + b.getTitle());
			System.out.println("BOOK PRICE " + b.getPrice());

		
		}
		em.getTransaction().commit();
		em.close();

	}

}
