package com.ritik.spring.springcoreAdvance.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component("bo")
public class OrderDAOImpl implements OrderDAO {
	@Override
	public String toString() {
		return "OrderDAOImpl []";
	}

	@Override
	public void createOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside order DAO ");
	}

}
