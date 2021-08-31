package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClientRead {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		

		Product product = em.find(Product.class, 1);
		System.out.println("Product Id: "+product.getId());
		System.out.println("Product Name: "+product.getName());
		System.out.println("Product Category: "+product.getCategory());
		System.out.println("Product Price: "+product.getPrice());



	}

}
