package com.controller;

import com.model.Employee;
import com.service.EmployeeService;

public class EmployeeController {
	public static void main(String[] args) {
		EmployeeService employeeService = new EmployeeService();
		
		/* controller: i want to create an employee and pass it to service class 
		 * I want service to give this employee a 8% increment on salary. 
		 * */

		Employee employee = new Employee(); 
		employee.setId(1);
		employee.setName("harry potter");
		employee.setSalary(90000);
		employee.setCity("mumbai");
		
		employee = employeeService.incrementSalary(employee);
		System.out.println("After increment salary is " + employee.getSalary());
	}
}
