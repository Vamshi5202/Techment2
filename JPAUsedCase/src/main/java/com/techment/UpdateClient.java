package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		Author author=em.find(Author.class, 13);
		author.setPhoneNo(818520011l);
		em.getTransaction().commit();
		em.close();
		
		
		

		
	}

}
