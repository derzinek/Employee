package com.employee.main.entity;

public class Employee 
{
	private int id;
	private String name;
	private String surName;
	private String jobDefinition;
	
	public Employee(int id, String name, String surName, String jobDefinition) 
	{
		super();
		this.id = id;
		this.name = name;
		this.surName = surName;
		this.jobDefinition = jobDefinition;
	}
	public Employee() 
	{
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getJobDefinition() {
		return jobDefinition;
	}
	public void setJobDefinition(String jobDefinition) {
		this.jobDefinition = jobDefinition;
	}

	
	
}
