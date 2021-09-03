package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsertClient {

	public static void main(String[] args) {

		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Author author=new Author();
		author.setAuthorId(12);
		author.setFirstName("vamshi");
		author.setMiddleName("krishna");
		author.setLastName("boddupally");
		author.setPhoneNo(9010485202l);
	
		
		em.persist(author);
				
		
		
		
        em.getTransaction().commit();
        em.close();

	}

}
