package br.com.java8.core;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
	public static void main(String[] args) {
		
		Duration duration = Duration.of(2, ChronoUnit.DAYS);
		
		System.out.println(duration.getSeconds());
		System.out.println(Duration.ofHours(1).getSeconds());
		System.out.println(Duration.ofDays(1).getSeconds());
		
	}
}
