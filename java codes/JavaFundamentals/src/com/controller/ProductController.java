package com.controller;

import com.model.Product;
import com.service.ProductService;

public class ProductController {
	public static void main(String[] args) {
		ProductService productService = new ProductService();
		
		/* I want to create product object and pass it to service. 
		 * I want service to compute discount on product price. 
		 * */
		
		Product product = new Product();
		product.setId(1);
		product.setPrice(34000);
		product.setTitle("Oppo Mobile");
		product.setDescription("jkdjkj");
		double discount = 5; 
		product = productService.computeDiscount(product,discount);
		System.out.println("After discount " + product.getPrice());
	}
}
