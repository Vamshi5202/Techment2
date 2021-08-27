package com.techment.dao;

import org.springframework.stereotype.Repository;
@Repository
public class Oracle implements IDao {

	
	public void databaseName() {

		System.out.println("connecting to oracle database");
	}

}
