package br.com.java8.core;

import java.util.List;

import br.com.java8.core.util.Employee;

public class ExternalIterationDemo {
	public static void main(String[] args) {
		
		List<Employee> list = Employee.getEmpList();
		for(Employee e : list) {
			e.setSal(e.getSal()*2);
		}
		
	}
}
