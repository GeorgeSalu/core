package br.com.java8.core;

import java.util.ArrayList;
import java.util.List;

import br.com.java8.core.util.StudentApply;

public class FunctionDemo2 {
	public static void main(String[] args) {
		
		List<StudentApply> list = new ArrayList<>();
		list.add(new StudentApply("Ram", 20));
		list.add(new StudentApply("George", 22));
		list.add(new StudentApply("Carlos", 18));
		
		for(StudentApply st:list ){
			System.out.println(st.customShow(s -> s.getName()+": "+s.getAge()));
		}
		
	}
}
