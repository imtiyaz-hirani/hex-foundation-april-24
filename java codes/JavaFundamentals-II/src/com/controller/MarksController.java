package com.controller;

import java.util.Scanner;

import com.exceptions.MarksException;
import com.service.MarksService;

public class MarksController {
	public static void main(String[] args) {
		MarksService marksService = new MarksService();
		Scanner sc = new Scanner(System.in);
		
		/* Read number of subjects from the user */
		System.out.println("Enter number of subjects: ");
		int numSubjects = sc.nextInt(); 
		int[] marks  = new int[numSubjects];
		
		for(int i=0; i<numSubjects; i++) {
			System.out.println("Enter marks of subject " + (i+1));
			int m = sc.nextInt();
			marks[i] = m;
		}
		
		System.out.println("ENter total Marks");
		int totalMarks = sc.nextInt();
		 
		try {
			String grade = marksService.computeGrade(marks,totalMarks);
			System.out.println("Ur Grade is " + grade);
		} catch (MarksException e) {
			 System.out.println(e.getMessage());
		}
		
		sc.close();
		
	
	}
}
