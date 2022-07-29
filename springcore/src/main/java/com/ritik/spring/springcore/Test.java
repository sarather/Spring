package com.ritik.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("springconfig.xml");
		Employee emp =(Employee) ctx.getBean("emp");
		Employee emp1 =(Employee) ctx.getBean("emp1");
		System.out.println("Employee Id : " + emp.getId());
		System.out.println("Emplyee name :" + emp.getName());
		System.out.println("Employee Id : " + emp1.getId());
		System.out.println("Emplyee name :" + emp1.getName());

	}

}
