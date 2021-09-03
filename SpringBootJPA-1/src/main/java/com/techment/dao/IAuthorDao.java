package com.techment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techment.entity.Author;
import com.techment.entity.Book;

public interface IAuthorDao extends JpaRepository<Author, Integer> {

}
