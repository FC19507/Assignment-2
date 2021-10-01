package com.example.flight;
import java.util.Random;

public class Flight {
	int flightId;
	String fromPlace;
	String toPlace;
	String airlineName;
	float ticketPrice;
	int businessSeats;
	int non_businessSeats;
	String date;
	String time;
	String days[];
	int pnr;

	public int getPnr() {
		return pnr;
	}

	public void setPnr() {
		Random rand = new Random();
		int upperbound = 125;
		int pNR = rand.nextInt(upperbound);
		this.pnr = pNR;
	}

	public int getFlightId() {
		return flightId;
	}

	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}

	public String getFromPlace() {
		return fromPlace;
	}

	public void setFromPlace(String fromPlace) {
		this.fromPlace = fromPlace;
	}

	public String getToPlace() {
		return toPlace;
	}

	public void setToPlace(String toPlace) {
		this.toPlace = toPlace;
	}

	public String getAirlineName() {
		return airlineName;
	}

	public void setAirlineName(String airlineName) {
		this.airlineName = airlineName;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public int getBusinessSeats() {
		return businessSeats;
	}

	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}

	public int getNon_businessSeats() {
		return non_businessSeats;
	}

	public void setNon_businessSeats(int non_businessSeats) {
		this.non_businessSeats = non_businessSeats;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}
}