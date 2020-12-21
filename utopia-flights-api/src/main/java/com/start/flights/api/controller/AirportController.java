/**
 * 
 */
package com.start.flights.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.start.flights.api.model.Flight;
import com.start.flights.api.service.AirportService;

/**
 * @author Jordf
 *
 */
@RestController
public class AirportController {

	private AirportService airportService;
	
	@Autowired
	public void setAirportService(AirportService airportService) {
		this.airportService=airportService;
	}
	
	//get all flights WORKS
	@RequestMapping(path = "/flights", method = RequestMethod.GET)
	public List<Flight> getAllFlights() {
		return airportService.getAllFlights();
	}
	
	//get individual flight by id
	@RequestMapping(path = "/flights/{flightId}", method = RequestMethod.GET)
	public ResponseEntity<Flight> getFlightById(@PathVariable int flightId) {
		return airportService.getFlightById(flightId);
	}
	
	//add new flight CREATES RECORD BUT DOESN'T PROPERLY PASS VALUES AND VALUES DONT SAVE
	@RequestMapping(path = "/flights", method = RequestMethod.POST)
	public ResponseEntity<String> addFlight(@RequestBody Flight newFlight) {
		return airportService.addFlight(newFlight);
	}
	
	
	
}
