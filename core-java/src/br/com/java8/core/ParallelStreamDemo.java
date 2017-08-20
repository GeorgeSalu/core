package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;

import br.com.java8.core.util.EmployeeCollection;

public class ParallelStreamDemo {
	public static void main(String[] args) {
		
		List<EmployeeCollection> list = new ArrayList<>();
		list.add(new EmployeeCollection(1, "A", 2000));
        list.add(new EmployeeCollection(2, "B", 3000));
        list.add(new EmployeeCollection(3, "C", 4000));
        list.add(new EmployeeCollection(4, "D", 5000));
		
        Predicate<EmployeeCollection> seniorEmp = e -> e.sal > 3000 && e.sal < 6000;
        OptionalDouble everageSal = list.parallelStream().filter(seniorEmp).mapToDouble(e -> e.sal).average();
        
        System.out.println(everageSal.getAsDouble());
        
	}
}
