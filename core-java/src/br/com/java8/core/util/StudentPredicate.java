package br.com.java8.core.util;

import java.util.function.Function;

public class StudentPredicate {
	public int age;
	public String gender;

	public StudentPredicate(int age, String gender) {
		this.age = age;
		this.gender = gender;
	}

	public String customShow(Function<StudentPredicate, String> fun) {
		return fun.apply(this);
	}
}
