package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class ReduceDemo3 {
	public static void main(String[] args) {
		
		List<Integer> list2 = Arrays.asList(2, 3, 4);
		
		int res = list2.parallelStream().reduce(2, (s1,s2) -> s1 * s2,(p,q) ->  p+q);
		System.out.println(res);
		
		List<String> list1 = Arrays.asList("Mohan", "Sohan", "Ramesh");
		String result = list1.parallelStream().reduce("-", (s1, s2) -> s1 + s2,(p,q) -> p + q);
		System.out.println(result);
	}
}
