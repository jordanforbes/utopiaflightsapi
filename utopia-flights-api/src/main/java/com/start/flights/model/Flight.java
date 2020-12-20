/**
 * 
 */
package com.start.flights.model;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.UUID;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Jordf
 *
 */
public class Flight {
	
	private final UUID id;
	private LocalDateTime departTime;
	private int seatsAvailable;
	private float price;
	private final int departCity;
	private final int arriveCity;
	
	public Flight(@JsonProperty("id") UUID id,
				  @JsonProperty("departTime") LocalDateTime departTime,
				  @JsonProperty("seatsAvailable") int seatsAvailable,
				  @JsonProperty("price") float price,
				  @JsonProperty("departCity") int departCity,
				  @JsonProperty("arriveCity") int arriveCity
				) 
		{
			this.id = id;
			this.departTime = departTime;
			this.price = price;
			this.departCity = departCity;
			this.arriveCity = arriveCity;
		}

	public LocalDateTime getDepartTime() {
		return departTime;
	}

	public void setDepartTime(LocalDateTime departTime) {
		this.departTime = departTime;
	}

	public int getSeatsAvailable() {
		return seatsAvailable;
	}

	public void setSeatsAvailable(int seatsAvailable) {
		this.seatsAvailable = seatsAvailable;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	//final properties
	public UUID getId() {
		return id;
	}

	public int getDepartCity() {
		return departCity;
	}

	public int getArriveCity() {
		return arriveCity;
	}

	
}
