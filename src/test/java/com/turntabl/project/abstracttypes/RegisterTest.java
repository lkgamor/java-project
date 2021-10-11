package com.turntabl.project.abstracttypes;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThrows;

import java.util.List;

import org.junit.jupiter.api.Test;

import com.turntabl.project.basicjava.Student;
import com.turntabl.project.enums.Level;
import com.turntabl.project.exceptions.StudentNotFoundException;
import com.turntabl.project.inheritance.NaughtyStudent;

public class RegisterTest {

	@Test
	public void shouldReturnNamesOfAllNameablesObjectsFromARegister() {
		
		// given
		Student student1 = new Student("Judith Ofosu", List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		Student student2 = new Student("Louis Ofosu", List.of(19.4, 13.0, 19.5, 20.2, 19.1));
		Student student3 = new Student("Jude Ofosu", List.of(14.8, 23.0, 13.5, 20.2, 12.1));
		Student student4 = new Student("Louis Gamor", List.of(30.2, 35.0, 45.5, 2.10, 18.6));
		
		NaughtyStudent naughtyStudent1 = new NaughtyStudent("Samuel Bankson", List.of(20.2, 15.0, 9.5, 20.2, 17.1));
		NaughtyStudent naughtyStudent2 = new NaughtyStudent("Ebenezer Denteh", List.of(40.0, 25.0, 11.0, 21.0, 27.0));
		NaughtyStudent naughtyStudent3 = new NaughtyStudent("Jeremiah Afotey", List.of(33.2, 16.0, 20.5, 27.2, 27.1));
		Register register = new Register(List.of(student1, student2, student3, student4, naughtyStudent1, naughtyStudent2, naughtyStudent3));
		
		// then
		register.getRegister().stream().forEach(studentName -> assertNotNull(studentName));
	}
	
	@Test
	void shouldReturnStudentUponSearchByName() {
		
		// given
//		Student student1 = new Student("Judith Ofosu", Level.LEVEL_100, List.of(10.2, 15.0, 9.5, 20.2, 17.1));
//		Student student2 = new Student("Louis Ofosu", Level.LEVEL_200, List.of(19.4, 13.0, 19.5, 20.2, 19.1));
//		Student student3 = new Student("Jude Ofosu", Level.LEVEL_300, List.of(14.8, 23.0, 13.5, 20.2, 12.1));
//		Student student4 = new Student("Louis Gamor", Level.LEVEL_100, List.of(30.2, 35.0, 45.5, 2.10, 18.6));
//		Register register = new Register(List.of(student1, student2, student3, student4));
		
		// when
		
	}
	
	@Test
	void shouldThrowExceptionWhenStudentNotFound() {
		
		// given
		Student student1 = new Student("Judith Ofosu", Level.LEVEL_100, List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		Student student2 = new Student("Louis Ofosu", Level.LEVEL_200, List.of(19.4, 13.0, 19.5, 20.2, 19.1));
		Student student3 = new Student("Jude Ofosu", Level.LEVEL_300, List.of(14.8, 23.0, 13.5, 20.2, 12.1));
		Student student4 = new Student("Louis Gamor", Level.LEVEL_100, List.of(30.2, 35.0, 45.5, 2.10, 18.6));
		Register register = new Register(List.of(student1, student2, student3, student4));
		
		// when
		assertThrows(StudentNotFoundException.class, ()-> {
			register.getStudentByName("James");
		});
	}

}
