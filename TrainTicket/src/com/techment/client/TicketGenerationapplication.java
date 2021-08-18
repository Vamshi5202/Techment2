package com.techment.client;

import java.util.Scanner;
import java.util.TreeMap;

import com.techment.dao.TrainDao;
import com.techment.dao.TrainDaoImpl;
import com.techment.model.Passenger;
import com.techment.model.Ticket;
import com.techment.model.Train;
import com.techment.service.ITrainService;
import com.techment.service.ITrainServiceImpl;



public class TicketGenerationapplication {
	static int counter = 100;

	public static void main(String[] args) {

		TrainDao trainDaoObj = new TrainDaoImpl();
		ITrainService service = new ITrainServiceImpl();

		TreeMap<Passenger, Integer> passengersMap = new TreeMap<Passenger, Integer>();

		Ticket ticket = new Ticket();

		try {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter The Train number ");
			int trainNo = scanner.nextInt();

			Train trainDetails = trainDaoObj.findTrain(trainNo);

			System.out.println("Enter The number of Passengers ");
			int passengers = scanner.nextInt();

			double totalFare = 0.0;
			for (int i = 0; i < passengers; i++) {
				System.out.println("Enter the name of " + (i + 1) + " passenger");
				String name = scanner.nextLine();
				name += scanner.nextLine();

				System.out.println("Enter the age of " + name);
				int age = scanner.nextInt();

				System.out.println("Enter the gender (M/F/O) of " + name);
				char gender = scanner.next().charAt(0);

				System.out.println("Enter the travel date in this format (DD/MM/YYYY)");
				String travelDate = scanner.next();
                
			
				boolean realTravelDate = service.checkDate(travelDate);

				if(realTravelDate==false)
					throw new Exception("You cant travel past");
				
				ticket.setTravelDate(travelDate);
				
				String pnr = service.calculatePnr(trainDetails.getSource(), trainDetails.getDestination(), travelDate,
						counter);
                ticket.setPnr(pnr);
				

				double fare = service.calculateFare(age, gender, trainDetails.getTicketPrice());
    
			//	System.out.println(pnr+" "+fare);
				ticket.addPassenger(name, age, gender,fare);

				totalFare += fare;

			}
			ticket.totalFarePrice(totalFare);
			ticket.generateTicket(trainDetails);

		//	System.out.println(trainDetails.getSource());

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}


}
