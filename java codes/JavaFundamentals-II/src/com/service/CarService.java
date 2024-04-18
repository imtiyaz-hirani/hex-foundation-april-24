package com.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import com.model.Car;

public class CarService {

	public List<Car> getAllCars() {
		 
		Car car1 = new Car(1,"MH-02 6654",LocalDate.of(2022, 02, 4), "Maruti Suzuki","Ertiga",1250000);
		Car car2 = new Car(2,"MH-04 4487",LocalDate.of(2019, 06, 14), "Tata","Altroz",1150000);
		Car car3 = new Car(3,"MH-12 2316",LocalDate.of(2020, 03, 15), "Renaut","Kiger",750000);
		
		List<Car> list = new ArrayList<>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		
		return list;
	}

	public List<Car> sortCarByPrice(List<Car> list, String sortDirection) {
		 
		if(sortDirection.equalsIgnoreCase("ASC")) {
			Collections.sort(list,new A());
		}
		else
		if(sortDirection.equalsIgnoreCase("DESC")) {
			Collections.sort(list,new B());
		}
		return list;
	}

}

class A implements Comparator<Car>{

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

class B implements Comparator<Car>{
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
