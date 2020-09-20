package com.niket.springcloud.flightservices.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.niket.springcloud.flightservices.models.Flight;
import com.niket.springcloud.flightservices.repos.FlightRepo;

@RestController
@RequestMapping("/flightapi")
public class FlightController {
	
	@Autowired
	FlightRepo flightRepo;
	
	@RequestMapping(value = "/flights", method = RequestMethod.GET)
	public List<Flight> findFlights() {
		
		return flightRepo.findAll();
		
	}

}
