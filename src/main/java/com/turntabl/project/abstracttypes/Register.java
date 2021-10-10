package com.turntabl.project.abstracttypes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.turntabl.project.basicjava.Student;
import com.turntabl.project.enums.Level;

public class Register {

	private List<Student> nameables;
	
	public Register() {}
	
	public Register(List<Student> students) {
		this.nameables  = students;
	}
	
	public List<String> getRegister() {
		return nameables.stream()
						.map(nameable -> nameable.getName())
						.collect(Collectors.toList());
	}
	
	public Map<Level, List<Student>> getRegisterByLevel(Level level) {
		Map<Level, List<Student>> studentsByLevel = new HashMap<>();
		studentsByLevel.put(level, nameables.stream()
											.filter(student -> student.getLevel().equalsIgnoreCase(level.toString()))
											.collect(Collectors.toList()));
		return studentsByLevel;
	}

	public List<Student> getNameables() {
		return nameables;
	}

	public void setNameables(List<Student> nameables) {
		this.nameables = nameables;
	}
	
	public Function<?, String> printReport = (a) -> {
		String studentsReport = getNameables().stream()
				.map(student -> String.format("student = %s", student.getName())).collect(Collectors.toList()).toString();
		return studentsReport;
	};
	
	public Function<Comparator<Student>, List<Student>> sort = (student) -> {
		return null;
	};

}
