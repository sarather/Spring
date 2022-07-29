package com.ritik.spring.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ctx = new ClassPathXmlApplicationContext(
				"com/ritik/spring/springcore/constructorinjection/config.xml");
		
		Employee e = (Employee) ctx.getBean("employee");
		System.out.println(e);
	}

}
