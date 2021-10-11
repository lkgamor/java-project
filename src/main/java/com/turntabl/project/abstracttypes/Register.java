package com.turntabl.project.abstracttypes;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.turntabl.project.basicjava.Student;
import com.turntabl.project.enums.Level;
import com.turntabl.project.exceptions.StudentNotFoundException;

public class Register {

	private List<Student> nameables;

	public Register() {}

	public <T extends List<Student>> Register(List<Student> students) {
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
											.filter(student -> student.getLevel() == level)
											.collect(Collectors.toList()));
		return studentsByLevel;
	}

	public List<Student> getNameables() {
		return nameables;
	}

	public Function<?, String> printReport = (a) -> {
		String studentsReport = getNameables().stream()
				.map(student -> String.format("student = %s", student.getName())).collect(Collectors.toList()).toString();
		return studentsReport;
	};
	
	public Function<Comparator<Student>, List<Student>> sort = (student) -> {
		return null;
	};

	public Student getStudentByName(String name) throws StudentNotFoundException {
		return getNameables().stream()
				.filter(student -> student.getName().contains(name))
				.findFirst()
				.orElseThrow(()-> new StudentNotFoundException("Student with name ".concat(name).concat(" not found!")));
	}

	public Optional<Student> getOptionalStudentByName(String name) {
		return getNameables().stream()
				.filter(student -> student.getName().contains(name))
				.findFirst();
	}

	public List<Student> getStudentByName(List<String> names) {
		return getNameables().stream()
				.filter(student -> names.contains(student.getName()))
				.collect(Collectors.toList());
	}
}
