package br.com.java8.stream;

import java.util.Arrays;
import java.util.List;

public class StreamCollect {
	public static void main(String[] args) {
		
	    List<String> list = Arrays.asList("Mukesh", "Vishal", "Amar");
	    String result = list.parallelStream().collect(StringBuilder::new,
	    		(response, element) -> response.append(" ").append(element),
	    		(response1, response2) -> response1.append(",").append(response2.toString()))
	    		.toString();
	    
	    System.out.println("Result: " + result);
	}
}
