package com.turntabl.project;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.turntabl.project.abstracttypes.Register;
import com.turntabl.project.basicjava.Lecture;
import com.turntabl.project.basicjava.Student;
import com.turntabl.project.enums.Level;
import com.turntabl.project.exceptions.StudentNotFoundException;
import com.turntabl.project.generics.Bag;
import com.turntabl.project.inheritance.NaughtyStudent;

public class MainApplication {

	public static void main(String[] args) {

//		generateStudentAverageGrades();
//		generateLectureAndHighestStudentAverageGrade();
//		invokeGetNameMethodOnStudent();
//		getAllNameablesOfStudentsFromARegister();
//		getAllNameOfStudentsGroupedByRegister();
//		getAllNamesAndLevelsOfStudentsFromARegister();
//		generateBagsOfElements();
//		Register register = new Register(getListOfNaughtyStudents());
//		findStudentByName();
		findStudentsByListOfNames();
	}
	
	@SuppressWarnings("unused")
	private static void generateStudentAverageGrades() {
		Student student = new Student(List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		System.out.println(student.getAverageGrade.apply(student.getGrades()));
	}


	@SuppressWarnings("unused")
	private static void generateLectureAndHighestStudentAverageGrade() {
		Lecture lecture = new Lecture();
		
		Student student1 = new Student(List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		Student student2 = new Student(List.of(19.4, 13.0, 19.5, 20.2, 19.1));
		Student student3 = new Student(List.of(14.8, 23.0, 13.5, 20.2, 12.1));
		Student student4 = new Student(List.of(30.2, 35.0, 45.5, 2.10, 18.6));
		
		NaughtyStudent naughtyStudent1 = new NaughtyStudent(List.of(20.2, 15.0, 9.5, 20.2, 17.1));
		NaughtyStudent naughtyStudent2 = new NaughtyStudent(List.of(40.0, 25.0, 11.0, 21.0, 27.0));
		NaughtyStudent naughtyStudent3 = new NaughtyStudent(List.of(33.2, 16.0, 20.5, 27.2, 27.1));
		
		lecture.enter(student1);
		lecture.enter(student2);
		lecture.enter(student3);
		lecture.enter(student4);
		lecture.enter(naughtyStudent1);
		lecture.enter(naughtyStudent2);
		lecture.enter(naughtyStudent3);
		
		lecture.getHighestAverageGrade.apply(lecture.getStudents());

		System.out.println("");
		System.out.println("-------------------------------------------------------------------");
		System.out.println("-----------A naughty student just changed their average grade------");
		System.out.println("-------------------------------------------------------------------");
		naughtyStudent1.increaseAverageGrade();
		naughtyStudent2.increaseAverageGrade();
		naughtyStudent3.increaseAverageGrade();
		
		lecture.getHighestAverageGrade.apply(lecture.getStudents());
	}

	public static String invokeGetNameMethodOnStudent() {
		NaughtyStudent student = new NaughtyStudent("Judith Ofosu", List.of(19.4, 13.0, 19.5, 20.2, 19.1));
		System.out.println(student.getName().concat(" = ").concat(String.valueOf(student.getAverageGrade)));
		student.increaseAverageGrade();
		System.out.println(student.getName().concat(" = ").concat(String.valueOf(student.getStudentAverageGrade())));
		return student.getName();
	}
	
	public static List<String> getAllNameablesOfStudentsFromARegister() {
		Register register = new Register(getListOfStudents());
		System.out.println(register.getRegister());
		return register.getRegister();
	}
	
	public static List<String> getAllNamesAndLevelsOfStudentsFromARegister() {
		Register register = new Register(getListOfStudentsAndNaughtyStudents());
		System.out.println(register.getRegisterByLevel(Level.LEVEL_400));
		return register.getRegister();
	}

	public static String getAllNameOfStudentsGroupedByRegister() {
		Register register = new Register(getListOfStudents());

		System.out.println(register.printReport.apply(null));
		return register.printReport.apply(null);
	}

	public static void findStudentByName() {
		try {
			Register register = new Register(getListOfStudentsAndNaughtyStudents());
			System.out.println(register.getStudentByName("Louis"));
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
	}

	public static void findStudentsByListOfNames() {
		Register register = new Register(getListOfStudentsAndNaughtyStudents());
		System.out.println(register.getStudentByName(List.of("Louis Gamor", "Judith Ofosu")));
	}

	public static void generateBagsOfElements() {
		
		Bag<Student> bagOfStudent = new Bag<>();
		getListOfStudents().forEach(student -> bagOfStudent.add(student));

		System.out.println("");
		System.out.println("-----------Loading bag of students------");
		System.out.println(bagOfStudent.getBag());

		System.out.println("");
		System.out.println("-----------Removed student from bag------");
		bagOfStudent.remove(getListOfStudents().get(1));
		
		System.out.println("");
		System.out.println("-----------Loading bag of students------");
		System.out.println(bagOfStudent.getBag());
		
		System.out.println("-----------Emptying bag of students------");
		bagOfStudent.clear();
	}


	private static List<Student> getListOfStudents() {
		Student student1 = new Student("Judith Ofosu", Level.LEVEL_100, List.of(10.2, 15.0, 9.5, 20.2, 17.1));
		Student student2 = new Student("Louis Ofosu", Level.LEVEL_200, List.of(19.4, 13.0, 19.5, 20.2, 19.1));
		Student student3 = new Student("Jude Ofosu", Level.LEVEL_300, List.of(14.8, 23.0, 13.5, 20.2, 12.1));
		Student student4 = new Student("Louis Gamor", Level.LEVEL_100, List.of(30.2, 35.0, 45.5, 2.10, 18.6));
		return List.of(student1, student2, student3, student4);
	}


	private static List<NaughtyStudent> getListOfNaughtyStudents() {
		NaughtyStudent naughtyStudent1 = new NaughtyStudent("Samuel Bankson", Level.LEVEL_300, List.of(20.2, 15.0, 9.5, 20.2, 17.1));
		NaughtyStudent naughtyStudent2 = new NaughtyStudent("Ebenezer Denteh", Level.LEVEL_400, List.of(40.0, 25.0, 11.0, 21.0, 27.0));
		NaughtyStudent naughtyStudent3 = new NaughtyStudent("Jeremiah Afotey", Level.LEVEL_100, List.of(33.2, 16.0, 20.5, 27.2, 27.1));
		return List.of(naughtyStudent1, naughtyStudent2, naughtyStudent3);
	}


	private static List<Student> getListOfStudentsAndNaughtyStudents() {
		return Stream.of(getListOfStudents(), getListOfNaughtyStudents())
				.flatMap(Collection::stream)
				.collect(Collectors.toList());
	}

}
