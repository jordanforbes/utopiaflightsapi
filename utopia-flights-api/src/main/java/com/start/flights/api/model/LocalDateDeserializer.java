/**
 * 
 */
package com.start.flights.api.model;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;

/**
 * @author Jordf
 *
 */
public class LocalDateDeserializer extends JsonDeserializer<LocalDate>{

	@Override
	public LocalDate deserialize(JsonParser p, DeserializationContext ctxt)
			throws IOException, JsonProcessingException {
		
		//custom deserializer
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		
		LocalDate localDate = null;
		localDate = LocalDate.parse(p.getText(), formatter);
		
		return localDate;
	}

}
