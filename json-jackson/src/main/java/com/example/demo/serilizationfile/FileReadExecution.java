package com.example.demo.serilizationfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

public class FileReadExecution {
	// With Gson
	public static void readFile(String fileAddress) throws JsonSyntaxException, JsonIOException, FileNotFoundException {
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		Person[] person = g.fromJson(new FileReader(fileAddress), Person[].class);
		System.out.println(g.toJson(person));
	}

	// With Jackson
	public static void readFileWithJackson(String fileAddress)
			throws JsonParseException, JsonMappingException, FileNotFoundException, IOException {
		ObjectMapper mapper = new ObjectMapper();
		Person[] person = mapper.readValue(new FileReader(fileAddress), Person[].class);
		System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(person));
		// System.out.println(mapper.writeValueAsString(person));
	}

	public static void main(String[] args)
			throws JsonSyntaxException, JsonIOException, JsonParseException, JsonMappingException, IOException {
		readFile(
				"D:\\Java Important Concepts & Codes Samples\\json-jackson\\src\\main\\java\\com\\example\\demo\\serilizationfile\\text.json");
		System.out.println("======================================");
		readFileWithJackson(
				"D:\\Java Important Concepts & Codes Samples\\json-jackson\\src\\main\\java\\com\\example\\demo\\serilizationfile\\text.json");
	}

}
