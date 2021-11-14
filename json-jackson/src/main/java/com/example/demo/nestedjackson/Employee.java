package com.example.demo.nestedjackson;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
	private String firstName;
	private String lastName;
	private Integer age;
	private EmployeeAddress address;
	private List<EmployeePhone> mobile;
}
