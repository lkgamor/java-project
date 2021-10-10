package com.turntabl.project.basicjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LectureTest {

	@Test
	void shouldReturnHighestAverageGrade() {
		Lecture lecture = new Lecture();
		lecture.enter(new Student(List.of(10.2, 15.0, 9.5, 20.2, 17.1)));
		lecture.enter(new Student(List.of(20.2, 25.0, 5.5, 10.2, 37.1)));
		lecture.enter(new Student(List.of(19.4, 13.0, 19.5, 20.2, 19.1)));
		lecture.enter(new Student(List.of(14.8, 23.0, 13.5, 20.2, 12.1)));
		lecture.enter(new Student(List.of(30.2, 35.0, 45.5, 2.10, 18.6)));
		assertEquals(26.28, lecture.getHighestAverageGrade.apply(lecture.getStudents()));
	}
}
