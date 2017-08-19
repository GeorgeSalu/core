package br.com.java8.core;

import java.util.List;

import br.com.java8.core.util.Employee;

public class InternalIterationDemo {
	public static void main(String[] args) {
		
		List<Employee> list = Employee.getEmpList();
		System.out.println("salary before update");
		
		list.forEach(e -> System.out.println(e.getSal()+" "));
		list.forEach(e -> e.setSal(e.getSal()*2));
		System.out.println("salary after update");
		
		list.forEach(e -> System.out.println(e.getSal()+" "));
	}
}
