package com.techment;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class MySqlDemo {

	JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void insertData() {
    jdbcTemplate.execute("insert into employee values(100,'murthy',30000)");
	System.out.println("data inserted");
	}

	
}
