package com.ritik.spring.springjdbc.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.ritik.spring.springjdbc.employee.dao.EmployeeDAO;
import com.ritik.spring.springjdbc.employee.dto.Employee;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("com/ritik/spring/springjdbc/test/config.xml");
		EmployeeDAO dao = (EmployeeDAO) ctx.getBean("employeeDao");
		
		/*
		 * Employee employee = new Employee(); employee.setId(2);
		 * employee.setFname("Yash"); employee.setLname("Rane");
		 */		// int result= dao.create(employee);
		
		//int result=dao.update(employee);
		//int result=dao.delete(2);
		
		//Employee result=dao.read(1);
		
		List<Employee> result = dao.read();
		System.out.println("Empployee Record : " +result);
	}

}
