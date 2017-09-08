package br.com.java8.core.util;

import java.util.function.Function;

public class StudentApply {

	public String name;
	public int age;

	public StudentApply(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String customShow(Function<StudentApply, String> fun) {
		return fun.apply(this);
	}

}
