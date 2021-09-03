package com.techment;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
      
		Book book1=new Book("deeru",1000);
		
		Book book2=new Book("laila",500);
		em.persist(book1);
		em.persist(book2);
		
		List<Book> books=new ArrayList<Book>();
		books.add(book1);
		books.add(book2);
		
		Author author=new Author();
		author.setName("keerthi");
		author.setBooks(books);
		
		em.persist(author);
		
		em.getTransaction().commit();
		em.close();
		
		
	}

}
