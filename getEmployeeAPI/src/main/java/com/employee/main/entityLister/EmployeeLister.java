package com.employee.main.entityLister;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.employee.main.entity.Employee;

@SuppressWarnings("serial")
@Repository 
public class EmployeeLister //database or list provider
{
	
	private static Map<Integer, Employee> employeeList;
	
	static
	{
		employeeList = new HashMap<Integer, Employee>()
		{
			{
				put(1, new Employee(1, "Ilyas", "Mollaogulari", "Erasmus Advisor"));
				put(2, new Employee(2, "Onur", "Kaya", "System Tester"));
				put(3, new Employee(3, "Tester_1", "Tests_1", "description_1"));
			}
			
		};
		
	}
	public Collection<Employee> getEmployeeList()
	{
		return EmployeeLister.employeeList.values();
	}

}
