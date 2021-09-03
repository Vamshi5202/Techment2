

package com.techment;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.swing.plaf.basic.BasicLabelUI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IProductDao;
import com.techment.entity.Product;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

	@Autowired
	IProductDao iProductDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("hello this is my first spring boot");
		/*
		 * Product product1 = new Product("laptop", "hp", 4500); 
		 * Product product2 = new
		 * Product("mobile", "note7pro", 2500); 
		 * iProductDao.save(product1);
		 * iProductDao.save(product2);
		 */

		System.out.println("inserted");

		// findall
	/*	List<Product> products = iProductDao.findAll();

		products.forEach(System.out::println);
		// find by id
		Optional<Product> product = iProductDao.findById(27);
		if (product.isPresent()) {
			System.out.println("Products" + product.get());
		} else {
			System.out.println("no value with given id");
		}

		Product product2 = iProductDao.findById(28).get();
		System.out.println("Product " + product2);
		// count
		long totalProducts = iProductDao.count();
		System.out.println("total no of products" + totalProducts);
		// delete by id
		iProductDao.deleteById(29);
		System.out.println("deleted");

		List<Product> prod = iProductDao.findByName("shirt");
		System.out.println("product" + prod);

		List<Product> prodList = iProductDao.findByCategory("hp");
		System.out.println(prodList);*/
		/*List<Product> list=iProductDao.findByName("shirt");
         System.out.println(list);
         List<Product> list2=iProductDao.findByNameAndCategory("laptop", "hp");
	     System.out.println(list2);
		List<Product> list=iProductDao.findByNameOrCategory("laptop", null);
	     System.out.println(list);
		List<Product> list=iProductDao.findByNameAndCategoryOrPrice("shirt", "cloth", 1000);
	    System.out.println(list);
		List<Product> list=iProductDao.findByPriceBetween(1000, 10000);
	   System.out.println(list);
	    List<Product> list=iProductDao.findByPriceLessThan(10000);
	    System.out.println(list);
		List<Product> list=iProductDao.findByPriceLessThanEqual(50000);
	    System.out.println(list);
		List<Product> list=iProductDao.findByPriceGreaterThan(40000);
	    System.out.println(list);
		List<Product> list=iProductDao.findByPriceGreaterThanEqual(45000);
	  System.out.println(list);
		List<Product> list=iProductDao.findByNameIsNull();
	  System.out.println(list);
		List<Product> list=iProductDao.findByNameIsNotNull();
	   System.out.println(list);
		List<Product> list=iProductDao.findByNameLike("h%");
	    System.out.println(list);
	List<Product> list=iProductDao.findByNameContaining("s");
	System.out.println(list);
		List<Product> list=iProductDao.findByNameStartingWith("h%");
	System.out.println(list);
		List<Product> list=iProductDao.findAllByOrderByNameAsc();
		System.out.println(list);
		List<Integer> price=new ArrayList<Integer>();
		price.add(1000);
		price.add(25000);
		List<Product> list=iProductDao.findByPriceIn(price);
		System.out.println(list);
		
		List<Integer> price=new ArrayList<Integer>();
		price.add(1000);
		price.add(25000);
		List<Product> list=iProductDao.findByPriceNotIn(price);
		System.out.println(list);*/
		List<Product> list=iProductDao.findByNameContainingIgnoreCase("Hp");
	   System.out.println(list);
	   
	
	}

}
