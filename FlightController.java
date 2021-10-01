package com.example.flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flight")
public class FlightController {
	@Autowired
	FlightService flightService;
	@GetMapping("/ticket/{name}")
	String getTicket(@PathVariable String name) {
		Flight flight = new Flight();
		System.out.println("Pnr details are : " + flight.getPnr());
		return ("PNR details are : "+flight.getPnr());
	}
	@PostMapping("/airline/inventory/add")
	void addInventory() {
		System.out.println("Added new flights");
	}
	@PostMapping("/booking/{flightid}")
	Flight post(@RequestBody Flight flight) {
		System.out.println("Got the flight details on screen");
		return flight;
	}
}