package com.turntabl.project.basicjava;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Lecture {

	private List<Student> studentsList = new ArrayList<>();

	public Lecture() {}
	
	public void enter(Student student) {
		student.getAverageGrade.apply(student.getGrades());
		studentsList.add(student);
	}

	public List<Student> getStudents() {
		for (Student student : studentsList) {
			System.out.println(student.toString());
		}
		return studentsList;
	}
	
	public Function<List<Student>, Double> getHighestAverageGrade = (students) -> {
		double highestAverageGrade = 0.0;
		List<Double> averageGrades = new ArrayList<>();
		
		for (Student student : students) {
			averageGrades.add(student.getStudentAverageGrade());
		}

		int i = 0;
		while (i + 1 < averageGrades.size()) {
			if (averageGrades.get(i) > averageGrades.get(i + 1)) {
				highestAverageGrade = averageGrades.get(i);
			} else {
				highestAverageGrade = averageGrades.get(i + 1);
			}
			i++;
		}

		System.out.println("");
		System.out.println("Average Grades = " + averageGrades);
		System.out.println("Highest Average Grade = " + highestAverageGrade);
		return highestAverageGrade;
	};

}
