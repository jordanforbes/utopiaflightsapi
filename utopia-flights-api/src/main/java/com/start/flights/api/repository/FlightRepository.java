package com.start.flights.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.start.flights.api.model.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Integer> {
	
}
