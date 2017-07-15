package br.com.java8.stream.modulo2;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.Line;

public class SumOfListDemo {
	public static void main(String[] args) {

		List<Line> list = new ArrayList<>();
		list.add(new Line(213));
		list.add(new Line(233));
		list.add(new Line(243));
		list.add(new Line(253));
		System.out.println("--Using IntStream.sum()--");

		int sum = list.stream().map(Line::getLength).mapToInt(Integer::intValue).sum();
		System.out.println(sum);
		System.out.println("--- Using Collectors.summingInt ---");
		
		sum = list.stream().map(Line::getLength).collect(Collectors.summingInt(i -> i));
		System.out.println(sum);
		System.out.println("-- Using summarizingInt ---");
		
		IntSummaryStatistics stats = list.stream().collect(Collectors.summarizingInt(Line::getLength));
		System.out.println(stats.getSum());
		System.out.println("--- Using Stream.reduce() with combiner ---");
		sum = list.parallelStream().reduce(0, (output,ob) -> output + ob.getLength(),(a,b) -> a + b);
		System.out.println(sum);
		
	}
}
