package br.com.java8.core;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.java8.core.util.StudentLambda;

public class ComparatorDemo {
	public static void main(String[] args) {
		
		List<StudentLambda> list = new ArrayList<>();
		list.add(new StudentLambda("Ram", 20));
		list.add(new StudentLambda("George", 23));
		list.add(new StudentLambda("Nazare", 23));
		System.out.println(" ----  before sorting ------ ");
		
		for(StudentLambda s: list) {
			System.out.println(s.getName());
		}
		
		//define comparator
		Comparator<StudentLambda> comp = (StudentLambda s1,StudentLambda s2) -> s1.getName().compareTo(s2.getName());
		Collections.sort(list,comp);
		System.out.println("---- after sorting -----");
		
		for(StudentLambda s : list) {
			System.out.println(s.getName());
		}
		
		
	}
}
