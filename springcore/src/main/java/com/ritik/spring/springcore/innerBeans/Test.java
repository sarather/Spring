package com.ritik.spring.springcore.innerBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ritik/spring/springcore/innerBeans/config.xml");
		Employee emp = (Employee) ctx.getBean("employee");
		System.out.println(emp);
		
	}

}
