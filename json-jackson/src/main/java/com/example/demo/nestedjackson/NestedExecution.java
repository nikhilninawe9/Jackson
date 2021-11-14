package com.example.demo.nestedjackson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class NestedExecution {
	public static void getJson(Employee employee) throws JsonMappingException, JsonProcessingException {
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		String empJson = g.toJson(employee);
		System.out.println("Employee to Json format: " + empJson);
		getJavaObject(empJson);
	}

	public static void getJavaObject(String json) throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Employee employee = mapper.readValue(json, Employee.class);
		System.out.println("Json data to java object: " + employee);
	}

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		Employee e = new Employee();
		e.setFirstName("Rohini Wakodikar");
		e.setLastName("Madanrao Wakodikar");
		e.setAge(34);
		EmployeeAddress address = new EmployeeAddress();
		address.setLane("Love Lane");
		address.setCity("Kuala Lampur");
		address.setPincode(440034);
		e.setAddress(address);
		EmployeePhone phone1 = new EmployeePhone();
		phone1.setPhoneNumber(818093271);
		phone1.setServiceUsed("Vodafone");
		EmployeePhone phone2 = new EmployeePhone();
		phone2.setPhoneNumber(6456565);
		phone2.setServiceUsed("Airtel");
		EmployeePhone phone3 = new EmployeePhone();
		phone3.setPhoneNumber(8465465);
		phone3.setServiceUsed("Idea");
		List<EmployeePhone> phoneList = new ArrayList<>(Arrays.asList(phone1, phone2, phone3));
		e.setMobile(phoneList);
		getJson(e);
	}
}
