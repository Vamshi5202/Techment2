package com.techment;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JQLClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		/*
		 * Query query= em.createQuery("select p from Product p"); List<Product>
		 * products=query.getResultList(); for(Product p:products) {
		 * System.out.println(p.getId()+" "+p.getName()); }
		 */
		System.out.println("===========================");
		/*
		 * Query query2 = em.createQuery("select p.id from Product p"); List<Integer>
		 * products2 = query2.getResultList();
		 * 
		 * for (Integer i : products2) { System.out.println(i); }
		 */
		System.out.println("============================");
		Query query3 = em.createNamedQuery("find");
		List<Product> productList = query3.getResultList();
		for (Product p : productList) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getCategory() + " " + p.getPrice());
		}

		em.getTransaction().commit();
		em.close();

	}

}
