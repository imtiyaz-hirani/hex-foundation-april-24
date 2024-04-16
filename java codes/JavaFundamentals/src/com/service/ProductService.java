package com.service;

import com.model.Product;

public class ProductService {

	public Product computeDiscount(Product product, 
			double discount) {
		double updatedPrice = product.getPrice() - (product.getPrice() * (discount/100)); 
		product.setPrice(updatedPrice);
		return product;
	}

}
