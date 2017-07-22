package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.java8.stream.dto.StudentComparator;

public class ThenComparing {
	public static void main(String[] args) {
		
		StudentComparator s1 = new StudentComparator("Shyam", 22);
        StudentComparator s2 = new StudentComparator("Ram",22);
        StudentComparator s3 = new StudentComparator("Mohan",19);
        List<StudentComparator> list = Arrays.asList(s1,s2,s3);
		
        Comparator<StudentComparator> ageComparator = Comparator.comparing(StudentComparator::getAge);
        Comparator<StudentComparator> namComparator = Comparator.comparing(StudentComparator::getName);
        Collections.sort(list,ageComparator.thenComparing(namComparator));
        
        list.forEach(s -> System.out.println("Name : "+s.getName()+" Age : "+s.getAge()));
        
	}
}
