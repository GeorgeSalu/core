package br.com.java8.core;

import java.time.DayOfWeek;

public class DayOfWeekDemo {
	public static void main(String[] args) {
		
		System.out.println(DayOfWeek.MONDAY.getValue());
		System.out.println(DayOfWeek.of(1));
		System.out.println(DayOfWeek.THURSDAY.getValue());
		System.out.println(DayOfWeek.of(2));
		System.out.println(DayOfWeek.SUNDAY.getValue());
		System.out.println(DayOfWeek.of(7));
		
	}
}
