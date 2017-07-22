package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.StudentCollector;

public class CollectorsPartitioningBy {
	public static void main(String[] args) {
		
		StudentCollector s1 = new StudentCollector("Ram", 18);
        StudentCollector s2 = new StudentCollector("Shyam",22);
        StudentCollector s3 = new StudentCollector("Mohan",19);
        StudentCollector s4 = new StudentCollector("Mahesh",20);
        StudentCollector s5 = new StudentCollector("Krishna",21);
        List<StudentCollector> list = Arrays.asList(s1,s2,s3,s4,s5);
		
        System.out.println("--- Partition of Student on the basic of age > 20 ---");
        Map<Boolean, List<StudentCollector>> stdByClass  = list.stream()
        		.collect(Collectors.partitioningBy(s -> s.getAge() > 20));
        
        stdByClass.forEach((k,v)->System.out.println("Key:"+k+"  "+ 
                ((List<StudentCollector>)v).stream().map(s->s.getName()).collect(Collectors.joining(","))));
        
	}
}
