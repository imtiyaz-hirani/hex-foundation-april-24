package com.controller;

import java.util.List;

import com.model.Car;
import com.service.CarService;

public class CarController {
	public static void main(String[] args) {
		CarService carService = new CarService();
		
		List<Car> list = carService.getAllCars();
		
		for(Car c : list) {
			System.out.println(c);
		}
		
		System.out.println("====Sort by price ASC====");
		list = carService.sortCarByPrice(list,"ASC");
		for(Car c : list) {
			System.out.println(c);
		}
		
		System.out.println("====Sort by price DESC====");
		list = carService.sortCarByPrice(list,"DESC");
		for(Car c : list) {
			System.out.println(c);
		}
	}
}
