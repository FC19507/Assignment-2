package com.example.flight;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("flight")
public class UserController {
	@GetMapping("/booking/history/{emailId}")
	void getHistory(@PathVariable String emailId) {
		System.out.println("Get booking details");
	}
	@PostMapping("/booking/user/{flightid}")
	void bookTicket(@PathVariable Integer flightid) {
		System.out.println("Your Tickets are booked");
	}
	@DeleteMapping("/booking/cancel/{pnr}")
	void cancelTicket() {
		System.out.println("Your Tickets are canceled");
	}
}