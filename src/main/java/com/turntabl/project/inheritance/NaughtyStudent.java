package com.turntabl.project.inheritance;

import java.util.List;

import com.turntabl.project.basicjava.Student;
import com.turntabl.project.enums.Level;

public class NaughtyStudent extends Student {

	public NaughtyStudent() {
		super();
	}

	public NaughtyStudent(double averageGrade) {
		super(averageGrade);
	}

	public NaughtyStudent(List<Double> grades) {
		super(grades);
	}

	public NaughtyStudent(String name, List<Double> grades) {
		super(name, grades);
	}

	public NaughtyStudent(String name, Level level, List<Double> grades) {
		super(name, level, grades);
	}

	public void increaseAverageGrade() {
		double averageGrade = this.getAverageGrade.apply(getGrades());
		double _10percentOfCurrentAverage = (averageGrade * 10) / 100;
		double hackedAverageGrade = _10percentOfCurrentAverage + this.getAverageGrade.apply(getGrades());
		System.out.println("Hacked Grade was = ".concat(String.valueOf(averageGrade)).concat(". It is now = ".concat(String.valueOf(hackedAverageGrade))));
		this.setStudentAverageGrade(hackedAverageGrade);
		System.out.println("___________________________________________________________________");
	}

	@Override
	public String toString() {
		return "NaughtyStudent [grades=" + getGrades()
				+ ", averageGrade=" + getStudentAverageGrade() + "]";
	}

		
}
