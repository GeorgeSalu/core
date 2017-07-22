package br.com.java8.stream.modulo3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxByMinByExample {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(30,10,20,35);
		//max
		list.stream().collect(Collectors.maxBy(new MaxByMinByExample().new IntegerComp()))
						.ifPresent(i -> System.out.println(i));
		
		//min
		list.stream().collect(Collectors.minBy(new MaxByMinByExample().new IntegerComp()))
						.ifPresent(i -> System.out.println(i));
		
	}
	
	class IntegerComp implements Comparator<Integer>{

		@Override
		public int compare(Integer i1, Integer i2) {
			
			if(i1 >= i2){
				return 1;
			}else{
				return -1;
			}
			
		}
		
	}
	
}
