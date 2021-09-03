package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techment.entity.Product;

@Repository
public interface IProductDao extends JpaRepository<Product,Integer> {
List<Product> findByName(String name);
/*List<Product> findByCategory(String category);

 List<Product> findByNameAndCategory(String category,String name);
  List<Product> findByNameContains(String ch);
List<Product> findByNameAndCategory(String category,String name);
List<Product> findByNameOrCategory(String category,String name);
List<Product> findByNameAndCategoryOrPrice(String category,String name,int price);
List<Product> findByPriceBetween(int start, int end);
List<Product> findByPriceLessThan(int price);
List<Product> findByPriceLessThanEqual(int price);
List<Product> findByPriceGreaterThan(int price);
List<Product> findByPriceGreaterThanEqual(int price);
List<Product>findByNameIsNull();
List<Product> findByNameIsNotNull();
List<Product> findByNameLike(String name);
List<Product> findByNameContaining(String name);
List<Product> findByNameStartingWith(String name);
List<Product> findAllByOrderByNameAsc();
public List<Product> findByPriceIn(List<Integer> price);

public List<Product> findByPriceNotIn(List<Integer> price);*/
List<Product> findByNameContainingIgnoreCase(String name);



}

