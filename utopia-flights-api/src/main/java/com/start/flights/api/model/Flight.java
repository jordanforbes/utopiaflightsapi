/**
 * 
 */
package com.start.flights.api.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

/**
 * @author Jordf
 *
 */

@Entity
@Table(name="tbl_flight")
public class Flight implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="flightid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	
	//converts sql DATETIME to Java LocalDateTime
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@Column(name="departtime")
	@JsonProperty("departTime")
	private LocalDateTime departTime;
	
	@Column(name="seatsavailable")
	@JsonProperty("seatsAvailable")
	private int seatsAvailable;
	
	@Column(name="price")
	@JsonProperty("price")
	private float price;
	
	@Column(name="departcityid")
	@JsonProperty("departCity")
	private int departCity;
	
	@Column(name="arrivecityid")
	@JsonProperty("arriveCity")
	private int arriveCity;
	
	public Flight() {
		super();
	}
	
	public Flight(int id,
				  LocalDateTime departTime,
				  int seatsAvailable,
				  float price,
				  int departCity,
				  int arriveCity
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
