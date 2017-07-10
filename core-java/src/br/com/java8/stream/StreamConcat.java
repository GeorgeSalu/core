package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamConcat {
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		
		Stream<Integer> resStream = Stream.concat(list1.stream(),list2.stream());
		resStream.forEach(s -> System.out.print(s + " ") );
		
	}
}
