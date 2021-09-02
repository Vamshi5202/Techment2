package com.test;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.OneToOne;
import javax.persistence.Persistence;

public class OneToManyBidirectionalClientDemo {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
	    Library library=new Library();
	    library.setName("sagar library");
	    em.persist(library);
	    Book b1=new Book();
	    b1.setBookName("python");
	    b1.setAuthor("jeevan");
	    b1.setLibrary(library);
	    
	    Book b2=new Book();
	    b2.setBookName("c");
	    b2.setAuthor("keerthi");
	    b2.setLibrary(library);
	    
	    em.persist(b1);
	    em.persist(b2);
	    
		em.getTransaction().commit();
		em.close();

	}

}
