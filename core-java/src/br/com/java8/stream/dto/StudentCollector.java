package br.com.java8.stream.dto;

public class StudentCollector {

	private String name;
	private int age;

	public StudentCollector(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
