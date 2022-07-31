package com.ritik.spring.springjdbc.employee.dao.impl;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import com.ritik.spring.springjdbc.employee.dao.EmployeeDAO;
import com.ritik.spring.springjdbc.employee.dao.rowmapper.EmployeeRowMapper;
import com.ritik.spring.springjdbc.employee.dto.Employee;

public class EmployeeDAOImpl implements EmployeeDAO {
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		String sql = "insert into employee values(?,?,?)";
		int result = jdbcTemplate.update(sql, employee.getId(), employee.getFname(), employee.getLname());

		return result;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public int update(Employee employee) {
		String sql = "update employee set firstname=? , lastname=? where id =?";
		int result = jdbcTemplate.update(sql, employee.getFname(), employee.getLname(), employee.getId());

		return result;
	}

	@Override
	public int delete(int id) {
		String sql="delete from employee where id=?";
		int result=jdbcTemplate.update(sql, id);
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql="select * from employee where id=?";
		EmployeeRowMapper rowmapper=new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql,rowmapper,id);
		return employee;
		
		
	}

	@Override
	public List<Employee> read() {
	
		String sql="select * from employee";
		EmployeeRowMapper rowm=new EmployeeRowMapper();
		List<Employee> query = jdbcTemplate.query(sql,rowm);
		return query;
	}

}
