package com.techment.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ITrainServiceImpl implements ITrainService {
	@Override
	public String calculatePnr(String source, String destination, String travelDate, int counter) {
		// TODO Auto-generated method stub

		String pnr = Character.toString(source.charAt(0));
		pnr += Character.toString(destination.charAt(0));
		pnr += "_";

		pnr += travelDate.replace("/", "");
		pnr += "_";
		pnr += String.valueOf(counter);

		// System.out.println(source+" from service");

		return pnr;
	}

	@Override
	public double calculateFare(int age, char gender, double ticketPrice) {

		if (age <= 12)
			return ticketPrice / 2;
		else if (age >= 60)
			return ticketPrice * 0.6;
		else if (gender == 'F' || gender == 'f')
			return ticketPrice * 0.75;
		else
			return ticketPrice;

	}

	@Override
	public boolean checkDate(String travelDate) {

		try {
			Date realDate = new SimpleDateFormat("dd/MM/yyyy").parse(travelDate);
			Date today = new Date();
			
			//System.out.println(today +" "+realDate+" "+realDate.compareTo(today));
			if(realDate.compareTo(today)==1||realDate.compareTo(today)==0)
				return true;
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}


}
