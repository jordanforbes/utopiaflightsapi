package com.start.flights.api;

class FlightNotFoundException extends RuntimeException{
	FlightNotFoundException(Long id){
		super("Could not find flight "+ id);
	}
}
