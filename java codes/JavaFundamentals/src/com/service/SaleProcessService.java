package com.service;

import java.util.List;

import com.model.Product;
 
public class SaleProcessService implements SaleProcess{

	@Override
	public void processOrder(List<Product> products) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean readyToDispatch(List<Product> products) {
		// TODO Auto-generated method stub
		return false;
	}
}
