package com.example.flight;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
public class FlightController {
	  @AutoWired
	  FlightService flightservice;
		//New Airline Booking
		@PostMapping(value="/api/v1.0/flight/airline/register")
		void bookingAirline() {
			System.out.println("ticketbooked...");
		}

		//Admin Login
		@PostMapping(value="/api/v1.0/flight/admin/login")
		void loginAdmin(@PathVariable String userName,@PathVariable String password) {
			if(userName.equals("Naresh")&&password.equals("123123"))
				System.out.println("Login Successfull...");
			else
				System.out.println("Invalid login credentials...");
		}
		
		//Add Inventory/Schedule of an existing Airline
		@PostMapping(value="/api/v1.0/flight/airline/inventory/add")
		void addSchedule() {
			System.out.println("schedule added successfully");
		}
		
		//Search on flights
		@PostMapping(value="/api/v1.0/flight/search")
		void searchFlight() {
			System.out.println("Flight not found/found");
		}
		
		@PostMapping(value="/api/v1.0/flight/booking/{flightid}")
		void bookTicket() {
			System.out.println("Flight Ticket booked");
		}
		
		//Get Booked ticket details based on PNR
		@GetMapping(value="/api/v1.0/flight/ticket/{pnr}")
		void getBookedTicket() {
			System.out.println("called Booked Ticket...");
		}

		//Get Booked tickets history based on Email ID
		@GetMapping(value="/api/v1.0/flight/ticket/{pnr}")
		void getHistoryOfBookedTicket() {
			System.out.println("called History of Booked Ticket...");
		}
		//Cancel a booked ticket
		@DeleteMapping(value="/api/v1.0/flight/booking/cancel/{pnr}")
		void deleteTicket() {
			System.out.println("Ticket Deleted...");
		}
	
           @PostMapping(value="flightService")
           String method1Flight(@RequestBody Flight flight) {
           	   flightservice.method1(flight);
        	   System.out.println("called..");
        	   System.out.println("Flight Number : "+flight.getFlightNumber());
        	   System.out.println("flight airline : "+flight.getAirline());
        	   System.out.println("From place : "+flight.getFromPlace());
        	   System.out.println("To place : "+flight.toPlace);
        	   System.out.println("light ticket price : "+flight.getTicketPrice());
        	   System.out.println("Number of busines class seat : "+flight.getBusinesClassSeat());
        	   System.out.println("Number of non busines class seats : "+flight.getNonBusinessClassSeat());
        	   System.out.println("meal : "+flight.getMeal());
           }
       
}
