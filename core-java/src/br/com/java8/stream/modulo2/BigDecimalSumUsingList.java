package br.com.java8.stream.modulo2;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import br.com.java8.stream.dto.PersonBigDecimal;
import br.com.java8.stream.util.Utility;

public class BigDecimalSumUsingList {
	public static void main(String[] args) {
		
		PersonBigDecimal p1 = new PersonBigDecimal("AAA", new BigDecimal("45.23"));
		PersonBigDecimal p2 = new PersonBigDecimal("BBB", new BigDecimal("55.43"));
		PersonBigDecimal p3 = new PersonBigDecimal("CCC", new BigDecimal("65.21"));
		PersonBigDecimal p4 = new PersonBigDecimal("DDD", new BigDecimal("35.73"));
		
		List<PersonBigDecimal> list = Arrays.asList(p1,p2,p3,p4);
		BigDecimal sum = list.stream().map(PersonBigDecimal::getWeight)
				.reduce(BigDecimal.ZERO, BigDecimal::add);
		
		System.out.println("Sum : "+sum);
		
		sum = list.stream().map(p -> p.getWeight())
				.reduce(BigDecimal.ZERO, (b1,b2) -> b1.add(b2));
		
		System.out.println(sum);
		
		sum = list.stream().map(PersonBigDecimal::getWeight)
				.reduce(BigDecimal.ZERO, Utility::addWeight);
		
		System.out.println(sum);
		
	}
}
