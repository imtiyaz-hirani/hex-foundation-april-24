package com.controller;

import com.model.Student;
import com.service.StudentService;

public class StudentController {
	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setName("harry potter");
		student1.setAge(21);
		student1.setPercent(74);
		
		Student student2 = new Student();
		student2.setId(2);
		student2.setName("ronald weasley");
		student2.setAge(22);
		student2.setPercent(71);
		
		Student student3 = new Student();
		student3.setId(3);
		student3.setName("hermione granger");
		student3.setAge(21);
		student3.setPercent(90);
		
		Student[] students = {student1, student2,student3}; //{100X,200X,300X}
		
		students  = studentService.alterPercentWithGrace(students);
		
		for(Student s : students) { //{100X,200X,300X}
			System.out.println(s.getName() + ":" + s.getPercent());
		}
		
	}
}
