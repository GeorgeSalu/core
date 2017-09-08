package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import br.com.java8.core.util.StudentApply;

public class FunctionDemo {
	public static void main(String[] args) {
		
		List<StudentApply> list = new ArrayList<>();
		list.add(new StudentApply("Ram", 20));
		list.add(new StudentApply("Shyam", 22));
		list.add(new StudentApply("Kadir", 22));
		
		//simple use of function
		for(StudentApply st: list) {
			System.out.println(st.customShow(s -> s.name+" : "+s.name));
		}
		
		//style one to declare function
		Function<StudentApply, String> styleONe = s -> {
			String result = "Name : "+s.name+" and Age : "+s.age;
			return result;
		};
		
		//style two to declare function
		Function<StudentApply, String> styleTwo = s -> "Name : "+s.name+" and Age : "+s.age;
		
		System.out.println("---- print value by style one ------");
		
		for(StudentApply st: list) {
			System.out.println(st.customShow(styleONe));
		}
		
		System.out.println("---- print value by style two -----");
		for(StudentApply st: list) {
			System.out.println(st.customShow(styleTwo));
		}
		
	}
}
