package com.ritik.spring.springcore.lc.xmlconfig;

public class Patient {
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void init() {
		System.out.println("Inside init method ");
	}
	public void destroy() {
		System.out.println("Inside Destroy");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + "]";
	}
}
