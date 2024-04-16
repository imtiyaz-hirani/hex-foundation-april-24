package com.service;

import com.model.Student;

public class StudentService {

	public Student[] alterPercentWithGrace(Student[] students) {//{100X,200X,300X}
		//iterate over students array, for each student, if percent>70 & percent<75 : add grace
		//Student[] tempArray =new Student[students.length];
	//	int i=0;
		
		for(Student s :students ) { //s=100X, s=200X, s=300X
			if(s.getPercent() >= 71 && s.getPercent() <= 74) { //71-74
				s.setPercent(75);
			}
		//tempArray[i++] = s;
		}
		return students;
	}
	
/* 
 * i=0,1,2
 * tempArray[0] = 100X
 * tempArray[1] = 200X
 * tempArray[2] = 300X
 */
}
