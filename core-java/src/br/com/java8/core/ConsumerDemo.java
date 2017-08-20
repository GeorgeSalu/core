package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import br.com.java8.core.util.Student;

public class ConsumerDemo {
	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<>();
		list.add(new Student("Ram",20));
        list.add(new Student("Shyam",22));
        list.add(new Student("Kabir",18));
        
        Consumer<Student> style = (Student s) -> System.out.println("Name : "+s.name+" and Age :"+s.age);
        
        list.forEach(style);
        
        list.forEach(Student::printData);
        list.forEach(s -> s.printData());
		
	}
}
