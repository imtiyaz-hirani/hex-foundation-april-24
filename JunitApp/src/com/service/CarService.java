package com.service;

import java.util.Collections;
import java.util.List;

import com.model.Car;
import com.utility.CarSortUtilityAsc;
import com.utility.CarSortUtilityDesc;

public class CarService {

	public List<Car> sortCarByPrice(List<Car> list, String sortDirection) {
		 
		if(sortDirection.equalsIgnoreCase("ASC")) {
			Collections.sort(list,new CarSortUtilityAsc());
		}
		else
		if(sortDirection.equalsIgnoreCase("DESC")) {
			Collections.sort(list,new CarSortUtilityDesc());
		}
		return list;
	}	
}
