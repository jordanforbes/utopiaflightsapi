/**
 * 
 */
package com.start.flights.api.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Jordf
 *
 */

@Entity
@Table(name="tbl_flight")
public class Flight {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	//converts sql DATETIME to Java LocalDateTime
	@Column(name="DEPARTTIME")
	@JsonDeserialize(using=LocalDateDeserializer.class)
	private LocalDateTime departTime;
	
	@Column(name="SEATSAVAILABLE")
	private int seatsAvailable;
	
	@Column(name="PRICE")
	private float price;
	
	@Column(name="DEPARTCITY")
	private int departCity;
	
	@Column(name="ARRIVECITY")
	private int arriveCity;
	
	public Flight() {
		super();
	}
	
	public Flight(@JsonProperty("id") int id,
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
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public int getDepartCity() {
		return departCity;
	}
	
	public void setDepartCity(int departCity) {
		this.departCity = departCity;
	}

	public int getArriveCity() {
		return arriveCity;
	}
	
	public void setArriveCity(int arriveCity) {
		this.arriveCity = arriveCity;
	}

	
}
