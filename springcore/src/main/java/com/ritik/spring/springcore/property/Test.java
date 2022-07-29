package com.ritik.spring.springcore.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/ritik/spring/springcore/property/config.xml");
			MyDAO md = (MyDAO) context.getBean("mydao");
			System.out.println(md);
	}

}
