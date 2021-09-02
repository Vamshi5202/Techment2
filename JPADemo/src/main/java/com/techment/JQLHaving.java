package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JQLHaving {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Object[]>cq=cb.createQuery(Object[].class);
		Root<Product> product=cq.from(Product.class);
		cq.multiselect(product.get("price"),cb.count(product)).groupBy(product.get("price")).having(cb.ge(product.get("price"), 50000));
		
	
		
		List<Object[]> list=em.createQuery(cq).getResultList();
		
		for(Object[] p:list) {
			System.out.println(p[0]+" "+p[1]);
		}
		
        em.getTransaction().commit();
        em.close();

		

	}

}
