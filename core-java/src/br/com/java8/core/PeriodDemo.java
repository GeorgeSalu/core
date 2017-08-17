package br.com.java8.core;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		
		LocalDate start = LocalDate.now();
		System.out.println("Period.betwen => "+Period.between(start, LocalDate.MAX).getDays());
		System.out.println("Period.ofDays => "+Period.ofDays(5).getDays());
		
	}
}
