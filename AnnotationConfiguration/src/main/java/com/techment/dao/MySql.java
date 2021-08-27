package com.techment.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MySql implements IDao {

	@Override
	public void databaseName() {

		System.out.println("connecting to mysql");
	}

}
