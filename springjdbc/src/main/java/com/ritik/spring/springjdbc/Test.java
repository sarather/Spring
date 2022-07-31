package com.ritik.spring.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ritik/spring/springjdbc/config.xml");
		JdbcTemplate e = (JdbcTemplate) ctx.getBean("jdbcTemplate");
		String sql="insert into employee values(?,?,?)";
		int result=e.update(sql,new Integer (1),"Ritik","Sarathe");
		System.out.println("No of record inserted : " +result);
	}

}
