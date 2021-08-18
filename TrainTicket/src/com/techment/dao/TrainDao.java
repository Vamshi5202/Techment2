package com.techment.dao;

import com.techment.model.Train;

public interface TrainDao {
	 public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	   public static final String URL = "jdbc:mysql://localhost:3306/techment1?autoReconnect=true&useSSL=false";
	   public static final String USERNAME = "root";
	   public static final String PASSWORD = "12345";
	   
	   public Train findTrain(int trainNo);
	   
}
