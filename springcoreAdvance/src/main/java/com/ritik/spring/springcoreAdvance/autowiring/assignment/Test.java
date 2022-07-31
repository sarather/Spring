package com.ritik.spring.springcoreAdvance.autowiring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ctx = new ClassPathXmlApplicationContext(
				"com/ritik/spring/springcoreAdvance/autowiring/assignment/config.xml");
		
		Customer e = (Customer) ctx.getBean("customer");
		System.out.println(e);
	}

}
