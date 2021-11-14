package com.example.demo.serilizationfile;

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
public class Addresses {
	private String Area;
	private int Pin;
	private double latitude;
	private double longitude;
}
