package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JQLClientFilter {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("select p from Product p where p.price between 20000 and 70000");
		List<Product> list = query.getResultList();

		for (Product p : list) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getCategory());
		}
		Query query2 = em.createQuery("select p from Product p where p.id in(1,2)");
		List<Product> list2 = query2.getResultList();
		for (Product p : list2) {
			System.out.println(p.getId() + " " + p.getName() + " " + p.getPrice() + " " + p.getCategory());
		}
		Query query3 = em.createQuery("select p from Product p where p.name like '%p%'");
		List<Product> list3 = query3.getResultList();
		for (Product p : list3) {
			System.out.println(p.getCategory() + " " + p.getPrice() + " " + p.getName() + p.getId());
		}

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
