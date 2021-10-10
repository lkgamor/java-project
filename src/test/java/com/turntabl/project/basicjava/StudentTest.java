package com.turntabl.project.basicjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class StudentTest {
	
	@Test
	void shouldReturnAverageGradesForStudent() {
		Student studentUnderTest = new Student(List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		assertEquals(14.4, studentUnderTest.getAverageGrade.apply(studentUnderTest.getGrades()));
	}
}
