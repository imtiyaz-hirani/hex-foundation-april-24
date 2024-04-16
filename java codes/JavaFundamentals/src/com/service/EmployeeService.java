package com.service;

import com.model.Employee;

public class EmployeeService {

	public Employee incrementSalary(Employee employee) {
		//salary = salary + (salary*0.08);
		double newSalary = employee.getSalary() + (employee.getSalary()*0.08);
		employee.setSalary(newSalary);
		return employee;
	}

}
