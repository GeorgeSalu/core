package br.com.java8.stream.modulo2;

import java.util.DoubleSummaryStatistics;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.Rectangle;
public class SummaryStatisticsDemoWithObject {
	public static void main(String[] args) {
		System.out.println("--DoubleSummaryStatistics--");
		List<Rectangle> list = Rectangle.getRectangle();
		DoubleSummaryStatistics dstats = list.stream()
			     .collect(Collectors.summarizingDouble(Rectangle::getWidth));
		System.out.println("Max:"+dstats.getMax()+", Min:"+dstats.getMin());
		System.out.println("Count:"+dstats.getCount()+", Sum:"+dstats.getSum());
		System.out.println("Average:"+dstats.getAverage());
		
		System.out.println("--IntSummaryStatistics--");
		list = Rectangle.getRectangle();
		IntSummaryStatistics istats = list.stream()
			     .collect(Collectors.summarizingInt(Rectangle::getLength));
		System.out.println("Max:"+istats.getMax()+", Min:"+istats.getMin());
		System.out.println("Count:"+istats.getCount()+", Sum:"+istats.getSum());
		System.out.println("Average:"+istats.getAverage());
		
		System.out.println("--LongSummaryStatistics--");
		list = Rectangle.getRectangle();
		LongSummaryStatistics lstats = list.stream().
				         collect(Collectors.summarizingLong(Rectangle::getId));
		System.out.println("Max:"+lstats.getMax()+", Min:"+lstats.getMin());
		System.out.println("Count:"+lstats.getCount()+", Sum:"+lstats.getSum());
		System.out.println("Average:"+lstats.getAverage());
	}
} 