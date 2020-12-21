/**
 * 
 */
package com.start.flights.api.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.start.flights.api.model.Flight;

/**
 * @author Jordf
 *
 */
@Repository
public interface AirportDao{

	//get all flights
	List<Flight> findAll();
	
	//get flight by id
	Flight getFlightById(int flightId);
	
	//add flight
	int insertFlight(int id, Flight flight);
	
	//add flight
	String insertFlight(Flight flight);
}
