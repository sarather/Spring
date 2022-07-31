package com.ritik.spring.springcoreAdvance.autowiring.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

	private Address address;
	
	
	public Address getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}
	@Autowired 
	public void setAddress(Address address) {
		this.address = address;
	}
}
