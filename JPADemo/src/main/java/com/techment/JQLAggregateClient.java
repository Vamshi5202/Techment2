package com.techment;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JQLAggregateClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query query=em.createQuery("select count(p) from Product p");
		System.out.println("Number of Products: "+query.getSingleResult());
		Query query2=em.createQuery("select MAX(p.price) from Product p");
		System.out.println("MAximum Price: "+query2.getSingleResult());
		Query query3=em.createQuery("select MIN(p.price) from Product p");
		System.out.println("MInimum Price :"+query3.getSingleResult());
		em.getTransaction().commit();
		
		
		em.close();
	}

}
