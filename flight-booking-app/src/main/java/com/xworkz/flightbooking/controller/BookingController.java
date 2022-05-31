package com.xworkz.flightbooking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BookingController {
	@PostMapping("/book.do")
////	public String bookFlight(String flightName, Double cost) {
//		System.out.println("Booking flight.." + flightName);
//		System.out.println("Flight cost..." + cost);
//		return "status";

	public ModelAndView bookFlight(String flightName, Double cost) {
		System.out.println("Booking flight.." + flightName);
		System.out.println("Flight cost..." + cost);
		return new ModelAndView("status", "fltNm", flightName);

	}

}
