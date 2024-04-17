package com.service;

import java.util.List;

import com.model.Product;

public  interface SaleProcess {
	 void processOrder(List<Product> products);
	 boolean readyToDispatch(List<Product> products);  
}
