package br.com.java8.stream.modulo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class UnaryOperatorDemo {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(10,20,30,40,50);
		UnaryOperator<Integer> unaryOpt = i -> i*i;
		unaryOperatorFun(unaryOpt, list).forEach(x -> System.out.println(x));
		
	}
	
	
	public static List<Integer> unaryOperatorFun(UnaryOperator<Integer> unaryOpt,List<Integer> list){
		List<Integer> uniList = new ArrayList<>();
		list.forEach(i -> uniList.add(unaryOpt.apply(i)));
		return uniList;
	}
	
}
