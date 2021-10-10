package com.turntabl.project.basicjava;

import java.util.List;
import java.util.function.Function;

import com.turntabl.project.abstracttypes.Nameable;
import com.turntabl.project.enums.HasLevel;
import com.turntabl.project.enums.Level;

public class Student implements Nameable, HasLevel {

	private String name;
	private String level;
	private List<Double> grades;
	private double studentAverageGrade;

	public Student() {}

	public Student(String level) {
		this.level = level;
	}
	
	public Student(Double averageGrade) {
		this.studentAverageGrade = averageGrade;
	}

	public Student(List<Double> grades) {
		this.grades = grades;
	}

	public Student(String name, List<Double> grades) {
		this.name = name;
		this.grades = grades;
	}

	public Student(String name, Level level, List<Double> grades) {
		this.name = name;
		this.level = level.toString();
		this.grades = grades;
	}

	public List<Double> getGrades() {
		return grades;
	}

	public void setGrades(List<Double> grades) {
		this.grades = grades;
	}

	public void setGrade(Double grade) {
		this.grades.add(grade);
	}

	public double getStudentAverageGrade() {
		return studentAverageGrade;
	}

	public void setStudentAverageGrade(double averageGrade) {
		this.studentAverageGrade = averageGrade;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getLevel() {
		return level;
	}	

	@Override
	public String toString() {
		return "Student [grades=" + grades + ", averageGrade=" + studentAverageGrade + "]";
	}	
	
	public Function<List<Double>, Double> getAverageGrade = (studentGrades) -> {
		Double totalGrades = studentGrades.stream().reduce(0.0, (currentTotalGrades, nextGrade) -> currentTotalGrades + nextGrade);
		double averageGrade = totalGrades / studentGrades.size();
		setStudentAverageGrade(averageGrade);
		return getStudentAverageGrade();
	};
	
}
