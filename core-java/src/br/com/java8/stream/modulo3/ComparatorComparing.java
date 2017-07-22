package br.com.java8.stream.modulo3;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.java8.stream.dto.StudentComparator;

public class ComparatorComparing {
	public static void main(String[] args) {
		
		List<StudentComparator> list = StudentComparator.getStudentList();
		Comparator<StudentComparator> ageComparator = Comparator.comparing(StudentComparator::getAge);
		Collections.sort(list,ageComparator);
		list.forEach(s -> System.out.println("Name : "+s.getName()+" Age : "+s.getAge()));
		
		System.out.println("-- Using reversed order for sorting ---");
		Collections.sort(list,ageComparator.reversed());
		list.forEach(s -> System.out.println("Name : "+s.getName()+" Age : "+s.getAge()));
		
		
	}
}
