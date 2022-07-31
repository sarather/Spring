package com.ritik.spring.springcoreAdvance.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static ApplicationContext ctx;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ctx = new ClassPathXmlApplicationContext(
				"com/ritik/spring/springcoreAdvance/stereotype/annotation/config.xml");
		
		Instructor e = (Instructor) ctx.getBean("instructor");
		System.out.println(e);
		Instructor e1 = (Instructor) ctx.getBean("instructor");
		System.out.println(e1);
	}

}
