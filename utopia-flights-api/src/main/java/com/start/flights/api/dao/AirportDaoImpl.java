/**
 * 
 */
package com.start.flights.api.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.start.flights.api.model.Flight;
import com.start.flights.api.repository.FlightRepository;

/**
 * @author Jordf
 *
 */
@Repository
public class AirportDaoImpl implements AirportDao {
	
	
	List<Flight> flights = new ArrayList<Flight>();
	
	@Autowired
	FlightRepository flightRepo;
	
	@Autowired
	public AirportDaoImpl() {
		flights = new ArrayList<Flight>();
		
	}

	
	public int insertFlight(int id, Flight flight) {
		flights.add(id, flight);
		return 0;
	}

	@Override
	public List<Flight> findAll() {
		
		return flightRepo.findAll();
	}


	@Override
	public int insertFlight(Flight flight) {
		flightRepo.save(flight);
		return 0;
	}

}
