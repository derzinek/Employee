package com.employee.main.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.main.entity.Employee;
import com.employee.main.service.EmployeeService;

@RestController //injection
@RequestMapping("/employeeList")//defines pattern
public class EmployeeController 
{
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(method = RequestMethod.GET) //Why this is a GET method
	public Collection<Employee> getEmployeeList()
	{
		return employeeService.getEmployeeList();
	}
}
