package com.turntabl.project.inheritance;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.turntabl.project.basicjava.Lecture;
import com.turntabl.project.basicjava.Student;

public class NaughtyStudentTest {

	@Test
	void shouldAssertThatNaughtyStudentIsAStudent() {
		
		// given
		Student student = new Student();
		NaughtyStudent naughtyStudent = new NaughtyStudent();
		System.out.println(naughtyStudent.getClass().isInstance(student));
		
		// then
		assertTrue(naughtyStudent.getClass().isInstance(student));
	}
	
	@Test
	void confirmChangeInNaughtyStudentAverageGrade() {

		// given
		Lecture lecture = new Lecture();
		NaughtyStudent naughtyStudent = new NaughtyStudent(List.of(10.2, 55.0, 9.5, 20.2, 17.1));
		
		// when
		lecture.enter(naughtyStudent);
		
		double naughtyStudentAverageGrade = naughtyStudent.getStudentAverageGrade();
		
		naughtyStudent.increaseAverageGrade();
		
		double hackedNaughtyStudentAverageGrade = naughtyStudent.getStudentAverageGrade();
		
		// then
		assertNotEquals(naughtyStudentAverageGrade, hackedNaughtyStudentAverageGrade);
	}

}
