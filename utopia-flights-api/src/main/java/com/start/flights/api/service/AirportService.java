package com.start.flights.api.service;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.start.flights.api.dao.AirportDaoImpl;
import com.start.flights.api.model.Flight;

@Service
public class AirportService {
	
	@Autowired
	private final AirportDaoImpl airportDao;
	
	public AirportService( AirportDaoImpl airportDao) {
		this.airportDao = airportDao;
	}
	
	public ResponseEntity<String> addFlight(Flight flight) {
		try {
			String addFlight= airportDao.insertFlight(flight);
			return new ResponseEntity<String>(addFlight, HttpStatus.CREATED);
			
		}catch(NoSuchElementException e) {
			return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
		}
	}
	
	
	
	public List<Flight> getAllFlights(){
		return airportDao.findAll();
	}

	public ResponseEntity<Flight> getFlightById(int flightId) {
		try {
			Flight oneFlight = airportDao.getFlightById(flightId);
			return new ResponseEntity<Flight>(oneFlight,HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<Flight>(HttpStatus.NOT_FOUND);
		}
	}
	

}
