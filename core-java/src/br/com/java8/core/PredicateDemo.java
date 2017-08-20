package br.com.java8.core;

import java.util.function.Function;
import java.util.function.Predicate;

import br.com.java8.core.util.StudentPredicate;

public class PredicateDemo {
	public static void main(String[] args) {
		
		Predicate<StudentPredicate> maleStudent = s -> s.age >= 20 && "male".equals(s.gender);
		Predicate<StudentPredicate> femaleStudent = s -> s.age > 15 && "female".equals(s.gender);

		Function<StudentPredicate, String> maleStyle = s -> "Hi, you are male and age"+s.age;
		Function<StudentPredicate, String> femaleStyle = s -> "Hi, you are male and age"+s.age;
		
		StudentPredicate s1 = new StudentPredicate(21, "male");
		if(maleStudent.test(s1)) {
			System.out.println(s1.customShow(maleStyle));
		}else if(femaleStudent.test(s1)) {
			System.out.println(s1.customShow(femaleStyle));
		}
		
	}
}
