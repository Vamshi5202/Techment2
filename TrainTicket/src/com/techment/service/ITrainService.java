package com.techment.service;

public interface ITrainService {
String calculatePnr(String source,String destination,String travelDate,int counter);
	
	boolean checkDate(String travelDate);
	double calculateFare(int age, char gender, double ticketPrice);
}
