package com.example.flight;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flight")
public class AirlineController {
	@GetMapping("/search/{flightid}")
	void searchFlight() {
		System.out.println("Find the required flight");
	}


	@PostMapping("/airline/register")
	Airline addAirline(@RequestBody Airline airline) {
		System.out.println("Added new airline");
		return airline;
	}
}