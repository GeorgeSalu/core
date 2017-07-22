package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.StudentReducing;

public class ReducingDemo {
	public static void main(String[] args) {
		
		StudentReducing s1 = new StudentReducing("Shyam", 22,"A");
        StudentReducing s2 = new StudentReducing("Ram",23,"A");
        StudentReducing s3 = new StudentReducing("Mohan",22,"B");
        StudentReducing s4 = new StudentReducing(null,21,"B");
		
        List<StudentReducing> list = Arrays.asList(s1,s2,s3,s4);
        Comparator<StudentReducing> ageComparator = Comparator.comparing(StudentReducing::getAge);
        Map<String, Optional<StudentReducing>> eldestByClass = list.stream().collect(Collectors.groupingBy(StudentReducing::getClassName,
        		Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
        
        eldestByClass.forEach((k,v)->System.out.println("Class:"+k+" Age:"+
                ((Optional<StudentReducing>)v).get().getAge()+" Name:"+((Optional<StudentReducing>)v).get().getName()));
        
	}
}
