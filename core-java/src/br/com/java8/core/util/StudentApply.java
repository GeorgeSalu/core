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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	

}
