package com.ritik.spring.springcoreAdvance.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public abstract class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx = new ClassPathXmlApplicationContext("com/ritik/spring/springcoreAdvance/injecting/interfaces/config.xml");
		OrderBoImpl e = (OrderBoImpl) ctx.getBean("bo");
		e.placeOrder();
		
		
		ApplicationContext ctx1 = new ClassPathXmlApplicationContext("com/ritik/spring/springcoreAdvance/injecting/interfaces/config1.xml");
		OrderBoImpl e1 = (OrderBoImpl) ctx1.getBean("bo");
		e1.placeOrder();
	}

}
