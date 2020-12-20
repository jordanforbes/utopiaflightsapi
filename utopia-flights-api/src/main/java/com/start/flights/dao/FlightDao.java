/**
 * 
 */
package com.start.flights.dao;

import java.util.UUID;

import com.start.flights.model.Flight;

/**
 * @author Jordf
 *
 */
public interface FlightDao {
	
	int insertFlight(UUID id, Flight flight);
	
	default int insertFlight(Flight flight) {
		UUID id = UUID.randomUUID();
		return insertFlight(id, flight);
	}

}
