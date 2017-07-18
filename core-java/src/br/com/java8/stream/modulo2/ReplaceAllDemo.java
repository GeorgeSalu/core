package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

import br.com.java8.stream.dto.PersonList;

public class ReplaceAllDemo {
	public static void main(String[] args) {
		
		List<PersonList> list = new ArrayList<PersonList>();
		list.add(new PersonList(1, "Mahesh"));
		list.add(new PersonList(2, "Ram"));
		list.add(new PersonList(3, "Krishna"));  

		Consumer<PersonList> style = (PersonList p) -> System.out.println("Id : "+p.getPid()+", Name : "+p.getName());
		System.out.println("---- Before replaceAll---");
		list.forEach(style);
		
		UnaryOperator<PersonList> unaryOpt = pn -> modifyName(pn);
		list.replaceAll(unaryOpt);
		System.out.println("--- After replaceAll---");
		list.forEach(style);
		
	}
	
	private static PersonList modifyName(PersonList p){
		p.setName(p.getName().concat(" -God"));
		return p;
	}
	
}
