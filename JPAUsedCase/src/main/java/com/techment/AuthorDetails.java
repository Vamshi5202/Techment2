package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AuthorDetails {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Author author = em.find(Author.class, 13);
		System.out.println("Author Id " + author.getAuthorId());
		System.out.println("Author FirstName " + author.getFirstName());
		System.out.println("Author Middle Name " + author.getMiddleName());
		System.out.println("Author Last Name " + author.getLastName());
		System.out.println("Author Phone Number " + author.getPhoneNo());
		em.close();

	}

}
