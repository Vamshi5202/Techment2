package com.techment.model;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ticket {
	private static int counter;
	private String pnr;
	private String travelDate;
	private Train train;

	private Map<Passenger, Integer> passengers = new HashMap<Passenger, Integer>();
	private double totalFare;



	String generatePNR() {
		return "";
	}

	double calculatePassengerFare(Passenger passenger) {
		return 0.0;
	}

	public void addPassenger(String name, int age, char gender, double fare) {
		Passenger passenger = new Passenger(name, age, gender, fare);
		this.passengers.put(passenger, this.counter);
	}

	double calculateTotalTicketPrice() {
		return 0.0;
	}

	void writeTicket() {

	}

	public static int getCount() {
		return counter;
	}

	public static void setCount(int count) {
		Ticket.counter = count;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public String getTravelDate() {
		return travelDate;
	}

	public void setTravelDate(String travelDate) {
		this.travelDate = travelDate;
	}

	public Train getTrain() {
		return train;
	}

	public void setTrain(Train train) {
		this.train = train;
	}

//	public TreeMap<Passenger, Integer> getPassengers() {
//		return passengers;
//	}
//
//	public void setPassengers(TreeMap<Passenger, Integer> passengers) {
//		this.passengers = passengers;
//	}

	public void totalFarePrice(double totalFare) {
		// TODO Auto-generated method stub
		this.totalFare = totalFare;

	}

	public void generateTicket(Train trainDetails) throws IOException {
		FileWriter writer = new FileWriter("PNRticket.txt");
		BufferedWriter buffer = new BufferedWriter(writer);

		String one = "PNR           : " + getPnr();
		String two = "Train no      : " + trainDetails.getTrainNo();
		String three = "Train name   : " + trainDetails.getTrainName();
		String four = "\nFrom       : " + trainDetails.getSource();
		String five = "To           : " + trainDetails.getDestination();
		String six = "Travel Date    : " + this.travelDate;
		String seven = "\n\nPassengers  ";

		String eight = "Name		Age		Gender		Fare  ";
		String nine = "";
		for (Entry<Passenger, Integer> p : passengers.entrySet()) {
			nine += p.getKey().getName() + "	" + p.getKey().getAge() + "			" + p.getKey().getGender()
					+ "			" + p.getKey().getFare() + "\n";
		}

		buffer.write(one + "\n" + two + "\n" + three + "\n" + four + "\n" + five + "\n" + six + "\n" + seven + "\n"
				+ eight + "\n" + nine + "\nTotal Fare : " + totalFare);

		buffer.close();
		System.out.println("Success");
	}

}
