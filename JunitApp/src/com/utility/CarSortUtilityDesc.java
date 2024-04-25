package com.utility;

import java.util.Comparator;

import com.model.Car;

public class CarSortUtilityDesc implements Comparator<Car>{
	@Override
	public int compare(Car c1, Car c2) {
		if(c1.getPrice() < c2.getPrice()) {
			return 1;
		}
		if(c1.getPrice() > c2.getPrice()) { //[45,34] 
			return -1;
		}
		if(c1.getPrice() > c2.getPrice()) { //[23,23]
			return 0;
		}
		return 0;
	}
}
