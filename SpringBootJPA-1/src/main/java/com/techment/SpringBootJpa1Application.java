package com.techment;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.techment.dao.IAuthorDao;
import com.techment.dao.IBookDao;
import com.techment.entity.Author;
import com.techment.entity.Book;

@SpringBootApplication
public class SpringBootJpa1Application implements CommandLineRunner {
    @Autowired
	IAuthorDao iAuthorDao;
    @Autowired
	IBookDao iBookDao;
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpa1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	  System.out.println("hello");
	 Author author1=new Author("shesham");
	  
	  
	 /*  iAuthorDao.save(author1);
	 
	  iBookDao.save(new Book("breakingbad",2000,author1));
	  iBookDao.save(new Book("boyguard",500,author1));*/

	 List<Book> books=iBookDao.findByPrice(1000);
	   
	  System.out.println(books);
	  
	  

		
	}

}
