package com.employee.main.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.main.entity.Employee;
import com.employee.main.entityLister.EmployeeLister;

@Service
public class EmployeeService //Service Provider
{
	@Autowired
	private EmployeeLister employeeLister;
	
	public Collection<Employee> getEmployeeList()
	{
		return employeeLister.getEmployeeList();
	}

}
