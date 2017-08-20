package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import br.com.java8.core.util.EmployeeCollection;

public class SequentialStreamDemo {
	public static void main(String[] args) {
		
		List<EmployeeCollection> list = new ArrayList<>();
        list.add(new EmployeeCollection(1, "A", 2000));
        list.add(new EmployeeCollection(2, "B", 3000));
        list.add(new EmployeeCollection(3, "C", 4000));
        list.add(new EmployeeCollection(4, "D", 5000));
		
        Predicate<EmployeeCollection> juniorEmp = e -> e.sal > 1000 && e.sal < 4000;
        int salsum = list.stream().filter(juniorEmp).mapToInt(e -> e.sal).sum();
        
        System.out.println(salsum);
        
	}
}
