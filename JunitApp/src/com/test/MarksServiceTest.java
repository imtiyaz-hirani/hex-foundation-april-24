package com.test;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.exception.MarksException;
import com.service.MarksService;

public class MarksServiceTest {
	
	MarksService MarksService = new MarksService();
	@Test
	public void computeGrade() {
		/* Use Case: 1 */
		//Prepare the input 
		List<Double> marksList = Arrays.asList(79D,76D,74D);
		double totalMarks = 300.0; 
		String expectedResult= "A";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { }
		
		/* Use Case: 2 */
		marksList = Arrays.asList(59D,76D,74D);
		totalMarks = 300.0; 
		expectedResult= "B";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { }
		
		/* Use Case: 3 */
		marksList = Arrays.asList(59D,46D);
		totalMarks = 200.0; 
		expectedResult= "C";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { }
		
		/* Use Case: 4 */
		marksList = Arrays.asList(39D,46D,35D,34D);
		totalMarks = 400.0; 
		expectedResult= "D";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { }
		
		/* Use Case: 5 */
		marksList = Arrays.asList(39D,-46D,35D,34D);
		totalMarks = 400.0; 
		expectedResult= "Marks cannot be negative";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { 
			Assert.assertEquals(expectedResult, e.getMessage());
		}
		
		/* Use Case: 6 */
		marksList = Arrays.asList(39D,46D,135D,34D);
		totalMarks = 400.0; 
		expectedResult= "Marks cannot be over 100";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { 
			Assert.assertEquals(expectedResult, e.getMessage());
		}
		
		/* Use Case: 7 */
		marksList = Arrays.asList(39D,46D,35D,34D);
		totalMarks = 600.0; 
		expectedResult= "Invalid total marks given";
		//from here call ur service method 
		try {
			String grade = MarksService.computeGrade(marksList, totalMarks);
			Assert.assertEquals(expectedResult, grade);
		} catch (MarksException e) { 
			Assert.assertEquals(expectedResult, e.getMessage());
		}
	}
}
/* To tell JVM that method is a test method, U shd give @Test annotation */