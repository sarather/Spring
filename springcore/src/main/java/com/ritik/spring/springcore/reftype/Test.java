package com.ritik.spring.springcore.reftype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("com/ritik/spring/springcore/reftype/config.xml");
		Student customer = (Student) ctx.getBean("student");
		System.out.println(customer);
	}

}
