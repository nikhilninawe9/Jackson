package com.example.demo;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonDemo {
	public static void getJson(User user) {
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		String jsonUser = g.toJson(user);
		System.out.println("Java object to json data: " + jsonUser);
		getObject(jsonUser);
	}

	public static void getObject(String json) {
		Gson g = new Gson();
		User user = g.fromJson(json, User.class);
		System.out.println("Json to java object: " + user);
	}

	public static void main(String[] args) {
		getJson(new User("ansh", "ninawe", 4));
	}
}
