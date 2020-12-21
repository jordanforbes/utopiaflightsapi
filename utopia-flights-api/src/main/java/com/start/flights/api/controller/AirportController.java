/**
 * 
 */
package com.start.flights.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping(path = "/flights", method = RequestMethod.GET)
	public List<Flight> getAllFlights() {
		return airportService.getAllFlights();
	}
	
	@RequestMapping(path = "/flights/{flightId}", method = RequestMethod.GET)
	public Flight getFlightById(@PathVariable int flightId) {
		return airportService.getFlightById(flightId);
	}
	
	@RequestMapping(path = "/flights", method = RequestMethod.POST)
	public int addFlight(@RequestBody Flight newFlight) {
		return airportService.addFlight(newFlight);
	}
	
	
	
}
