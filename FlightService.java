package com.example.flight;

import org.springframework.stereotype.Service;

@Service
public class FlightService {
	
 public void save(Flight flight) {
	 System.out.println("Service method called");
 }
}
