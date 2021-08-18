package com.techment.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.techment.model.Train;



public class TrainDaoImpl implements TrainDao{
	
	public Train findTrain(int trainNo) {


		try {
			Train train=null;
			Class.forName(TrainDao.DRIVER_NAME);
			System.out.println("class loaded");
			Connection con = DriverManager.getConnection(TrainDao.URL,TrainDao.USERNAME,TrainDao.PASSWORD);
			System.out.println("Connected");
			PreparedStatement ps = con.prepareStatement("select * from TRAINS where trainNo =?");
			ps.setInt(1, trainNo);
			ResultSet rs =ps.executeQuery();
			
		
			
			while(rs.next())
			{
				//System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getDouble(5));
				train = new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5));
				
				//System.out.println(rs.getString(4));
			}
			
			
			return train;
			
			
		}catch(Exception err)
		{
			System.out.println(err);
		}
		
		return null;
	}

}
