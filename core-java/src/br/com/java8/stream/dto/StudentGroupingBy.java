package br.com.java8.stream.dto;

public class StudentGroupingBy {
	private String name;
	private int age;
	private String className;

	public StudentGroupingBy(String name, String className, int age) {
		this.name = name;
		this.age = age;
		this.className = className;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getClassName() {
		return className;
	}
}
