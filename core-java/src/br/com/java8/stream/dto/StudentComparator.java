package br.com.java8.stream.dto;

import java.util.Arrays;
import java.util.List;

public class StudentComparator implements Comparable<StudentComparator> {
	private String name;
	private int age;

	public StudentComparator(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public static List<StudentComparator> getStudentList() {
		StudentComparator s1 = new StudentComparator("Ram", 18);
		StudentComparator s2 = new StudentComparator("Shyam", 22);
		StudentComparator s3 = new StudentComparator("Mohan", 19);
		StudentComparator s4 = new StudentComparator("Mahesh", 20);
		StudentComparator s5 = new StudentComparator("Krishna", 21);
		List<StudentComparator> list = Arrays.asList(s1, s2, s3, s4, s5);
		return list;
	}

	@Override
	public int compareTo(StudentComparator o) {
	     return this.name.compareTo(o.name);
	} 
}
