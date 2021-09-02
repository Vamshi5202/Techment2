package com.techment;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class JQLSingleFetch {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("s");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		CriteriaBuilder cb=em.getCriteriaBuilder();
		CriteriaQuery<Product>cq=cb.createQuery(Product.class);
		Root<Product> product=cq.from(Product.class);
		cq.select(product.get("price"));
		
		CriteriaQuery<Product> select=cq.select(product);
		TypedQuery<Product> query=em.createQuery(select);
		List<Product> list=query.getResultList();
		
		for(Product p:list) {
			System.out.println(p.getPrice());
		}
		
        em.getTransaction().commit();
        em.close();
	}

}
