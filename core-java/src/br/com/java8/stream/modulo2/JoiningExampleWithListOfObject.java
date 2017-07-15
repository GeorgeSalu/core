package br.com.java8.stream.modulo2;

import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.PersonJoin;

public class JoiningExampleWithListOfObject {
	public static void main(String[] args) {
		
		List<PersonJoin> list = PersonJoin.getList();
        System.out.println("--Join person name--");
        String result=  list.stream().map(p -> p.getName()).collect(Collectors.joining());
        System.out.println(result);
        result=  list.stream().map(p -> p.getName()).collect(Collectors.joining("|"));
        System.out.println(result);
        result=  list.stream().map(p -> p.getName()).collect(Collectors.joining("-","[","]"));
        System.out.println(result);
        
        System.out.println("--Join person age--");
        result=  list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining());
        System.out.println(result);
        result=  list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("|"));
        System.out.println(result);
        result=  list.stream().map(p -> String.valueOf(p.getAge())).collect(Collectors.joining("-","[","]"));
        System.out.println(result);       
        
        System.out.println("--Join person name-age--");
        result=  list.stream().map(p -> p.getName()+"-" + p.getAge()).collect(Collectors.joining("|"));
        System.out.println(result);
        result=  list.stream().map(p -> p.getName()+"-" + p.getAge()).collect(Collectors.joining("|","[","]"));
        System.out.println(result);        
		
	}
}
