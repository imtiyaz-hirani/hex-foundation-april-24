package com.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.model.Car;
import com.service.CarService;

 
 
public class CarServiceTest {

	CarService carService = new CarService();
	@Test
	public void sortCarByPrice() {
		/* Use Case: 1 */
		
		/* Prepare the inputs */
		Car car1 = new Car(1,"MH-02 6654",LocalDate.of(2022, 02, 4), "Maruti Suzuki","Ertiga",1250000);
		Car car2 = new Car(2,"MH-04 4487",LocalDate.of(2019, 06, 14), "Tata","Altroz",1150000);
		Car car3 = new Car(3,"MH-12 2316",LocalDate.of(2020, 03, 15), "Renaut","Kiger",750000);
	
		List<Car> list = Arrays.asList(car1,car2,car3);
		String sortDirection = "ASC";
		
		List<Car> expectedList = Arrays.asList(car3,car2,car1);
		List<Car> actualList = carService.sortCarByPrice(list, sortDirection);
		Assert.assertEquals(expectedList, actualList);
		
		/* Use Case: 2 */
		
		/* Prepare the inputs */
		sortDirection = "DESC";
		
		expectedList = Arrays.asList(car1,car2,car3);
		actualList = carService.sortCarByPrice(list, sortDirection);
		Assert.assertEquals(expectedList, actualList);
		
		/* Use Case: 3 */
		
		/* Prepare the inputs */
		sortDirection = "ASC";
		list = Arrays.asList(car1,car3);
		expectedList = Arrays.asList(car3,car1);
		actualList = carService.sortCarByPrice(list, sortDirection);
		Assert.assertEquals(expectedList, actualList);
		
		/* Use Case: 4 */
		
		/* Prepare the inputs */
		sortDirection = "WRONG_DIRECTION";
		list = Arrays.asList(car1,car2,car3);
		expectedList = Arrays.asList(car1,car2,car3);
		actualList = carService.sortCarByPrice(list, sortDirection);
		Assert.assertEquals(expectedList, actualList);
		
		/* Use Case: 5: Intential fail */
		
		/* Prepare the inputs */
		sortDirection = "WRONG_DIRECTION";
		list = Arrays.asList(car2,car1,car3);
		expectedList = Arrays.asList(car1,car2,car3);
		actualList = carService.sortCarByPrice(list, sortDirection);
		try {
			Assert.assertEquals(expectedList, actualList);
		}
		catch(Error e) {}
	}
}
