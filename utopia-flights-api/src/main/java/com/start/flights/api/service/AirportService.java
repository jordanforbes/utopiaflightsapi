package com.start.flights.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.start.flights.api.dao.AirportDaoImpl;
import com.start.flights.api.model.Flight;
import com.start.flights.api.repository.FlightRepository;

@Service
public class AirportService {
	
	@Autowired
	private final AirportDaoImpl airportDao;
	
	public AirportService( AirportDaoImpl airportDao) {
		this.airportDao = airportDao;
	}
	
	public int addFlight(Flight flight) {
		return airportDao.insertFlight(flight);
	}
	
	public List<Flight> getAllFlights(){
		return airportDao.findAll();
	}

	public Flight getFlightById(int flightId) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
