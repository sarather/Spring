package com.ritik.spring.springcoreAdvance.standalonecollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ctx = new ClassPathXmlApplicationContext(
				"com/ritik/spring/springcoreAdvance/standalonecollections/config.xml");
		
		ProductList e = (ProductList) ctx.getBean("productlist");
		System.out.println(e);
	}

}
