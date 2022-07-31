package com.ritik.spring.springcoreAdvance.autowiring.assignment;

import org.springframework.beans.factory.annotation.Autowired;

public class Customer {
	@Override
	public String toString() {
		return "Customer [name=" + name + ", reservation=" + reservation + "]";
	}
	private String name;
	@Autowired
	Reservation reservation;

}
