package com.service;

import java.util.List;

import com.exception.MarksException;

public class MarksService {

	public String computeGrade(List<Double> marksList, double totalMarks) throws MarksException {
		//compute total marks
		if(totalMarks > (100 * marksList.size())) 
				throw new MarksException("Invalid total marks given");
		
		//compute total marks score
		
		double totalMarksScored=0;
		
		for(double m : marksList) {
			if(m > 100) 
				throw new MarksException("Marks cannot be over 100");
			if(m < 0) 
				throw new MarksException("Marks cannot be negative");
			
			totalMarksScored = totalMarksScored + m;
		}
		
		//compute percent
		double percent = (totalMarksScored * 100) / totalMarks;
		
		if(percent > 100)
			throw new MarksException("Check your inputs, total Marks cannot be more than marks scored");
		
		if(percent > 75)
			return "A";
		if(percent > 60)
			return "B";
		if(percent > 45)
			return "C";
		
		return "D";
		 
	}

}
