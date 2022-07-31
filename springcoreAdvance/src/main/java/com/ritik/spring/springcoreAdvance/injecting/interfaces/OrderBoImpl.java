package com.ritik.spring.springcoreAdvance.injecting.interfaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OrderBoImpl implements OrderBo {
	@Autowired
	private OrderDAO dao;
	@Override
	public void placeOrder() {
		// TODO Auto-generated method stub
		System.out.println("Inside order Bo");
		dao.createOrder();
	}
	@Override
	public String toString() {
		return "OrderBoImpl [dao=" + dao + "]";
	}
	public OrderDAO getDao() {
		return dao;
	}
	public void setDao(OrderDAO dao) {
		this.dao = dao;
	}

}
