package br.com.java8.stream.modulo3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.java8.stream.dto.StudentComparator;

public class ComparatorNaturalOrder {
	public static void main(String[] args) {
		
		List<StudentComparator> list = StudentComparator.getStudentList();
		Collections.sort(list,Comparator.naturalOrder());
		list.forEach(s -> System.out.println("Name : "+s.getName()+" Age : "+s.getAge()));
		
		System.out.println("-- Using natural reversed order for sorting --");
		Collections.sort(list,Comparator.reverseOrder());
		list.forEach(s -> System.out.println("Name : "+s.getName()+" Age : "+s.getAge()));
		
	}
}
