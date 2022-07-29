package com.ritik.spring.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{
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

	@Override
	public void afterPropertiesSet() throws Exception { //init method
		// TODO Auto-generated method stub
		System.out.println("inside after properties");
	}
}
