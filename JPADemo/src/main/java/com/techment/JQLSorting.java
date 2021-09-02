package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JQLSorting {
 public static void main(String[] args) {
	 EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		Query query=em.createQuery("select p from Product p order by p.price desc");
		List<Product> list=query.getResultList();
		for(Product p:list) {
			System.out.println(p.getId()+" "+p.getCategory()+" "+p.getName());
			
		}
		
		em.getTransaction().commit();

}
}
