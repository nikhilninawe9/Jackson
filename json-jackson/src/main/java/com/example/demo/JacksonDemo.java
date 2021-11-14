package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonDemo {
	public static void getJson(User user) throws JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		String jsonUser = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(user);
		System.out.println("Java object to jsonUser: " + jsonUser);
		getObject(jsonUser);
	}

	public static void getObject(String json) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		User user = mapper.readValue(json, User.class);
		System.out.println("Json to java object: " + user);
	}

	public static void main(String[] args) throws JsonProcessingException {
		getJson(new User("nikhil", "ninawe", 32));
	}
}
