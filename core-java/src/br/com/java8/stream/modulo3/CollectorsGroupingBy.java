package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.StudentGroupingBy;

public class CollectorsGroupingBy {
	public static void main(String[] args) {
		
		StudentGroupingBy s1 = new StudentGroupingBy("Ram", "A", 20);
        StudentGroupingBy s2 = new StudentGroupingBy("Shyam", "B", 22);
        StudentGroupingBy s3 = new StudentGroupingBy("Mohan", "A", 22);
        StudentGroupingBy s4 = new StudentGroupingBy("Mahesh", "C", 20);
        StudentGroupingBy s5 = new StudentGroupingBy("Krishna", "B", 21);
        List<StudentGroupingBy> list = Arrays.asList(s1,s2,s3,s4,s5);
		
        System.out.println("-- Group Student on the basic of ClassName --");
        Map<String, List<StudentGroupingBy>> stdByClass = list.stream().collect(Collectors.groupingBy(StudentGroupingBy::getClassName));
        
         stdByClass.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                        ((List<StudentGroupingBy>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));
	
         //Group Student on the basics of age
         System.out.println("--- Group Student on the basics of age ---");
         Map<Integer, List<StudentGroupingBy>> stdByAge = list.stream().collect(Collectors.groupingBy(StudentGroupingBy::getAge));
         
         stdByAge.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                 ((List<StudentGroupingBy>)v).stream().map(m->m.getName()).collect(Collectors.joining(","))));
	
	}           
}
