package com.service;

import com.exceptions.MarksException;

public class MarksService {

	public String computeGrade(int[] marks, int totalMarks) throws MarksException  {
		//compute totalMarksScored
		
		if(totalMarks > (100 * marks.length)) 
			throw new MarksException("Invalid total marks given");
		
		int totalMarksScored=0;
		
		for(int m : marks) {
			if(m > 100) 
				throw new MarksException("Marks cannot be over 100");
			if(m < 0) 
				throw new MarksException("Marks cannot be negative");
			
			totalMarksScored = totalMarksScored + m;
		}
		
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
