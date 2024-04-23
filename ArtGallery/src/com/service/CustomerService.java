package com.service;

import java.sql.SQLException;

import com.dao.CustomerDao;
import com.dao.CustomerDaoImpl;
import com.model.Customer;

public class CustomerService {

	CustomerDao custmoerDao = new CustomerDaoImpl();

	public void save(Customer customer) throws SQLException {
		custmoerDao.save(customer);
		
	}
	
	
}
