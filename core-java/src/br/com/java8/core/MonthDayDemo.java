package br.com.java8.core;

import java.time.MonthDay;

public class MonthDayDemo {
	public static void main(String[] args) {
		
		MonthDay mday = MonthDay.now();
		System.out.println(mday.getDayOfMonth());
		System.out.println(mday.getMonth());
		System.out.println(mday.atYear(2014));
		
	}
}
