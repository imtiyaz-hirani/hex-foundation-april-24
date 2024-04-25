package com.utility;

import java.util.Comparator;

import com.model.Car;

public class CarSortUtilityAsc implements Comparator<Car>{

	@Override
	public int compare(Car c1, Car c2) {   //[34,67]
		if(c1.getPrice() < c2.getPrice()) {
			return -1;
		}
		if(c1.getPrice() > c2.getPrice()) { //[45,34] 
			return 1; //swap
		}
		if(c1.getPrice() > c2.getPrice()) { //[23,23]
			return 0;
		}
			
		return 0;
	}
	//if you want me to swap: return any positive number(1)
	//if you want me to do nothing, return any -ve number (-1)
	//if you have same values in comparision, return 0. 
}
