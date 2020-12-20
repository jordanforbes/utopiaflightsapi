package com.start.flights.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.start.flights.dao.FlightDao;

@Service
public class FlightService {
	private final FlightDao flightDao;
	
	@Autowired
	public FlightService(@Qualifier("mongo") FlightDao flightDao) {
		this.flightDao = flightDao;
	}
	
	public int addFlight(Flight flight) {
		return flightDao.insertFlight(flight);
	}
}
