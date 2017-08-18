package br.com.java8.core;

import java.time.OffsetTime;

public class OffsetTimeDemo {
	public static void main(String[] args) {
		
		OffsetTime offTime = OffsetTime.now();
		System.out.println(offTime.getHour()+" hours");
		System.out.println(offTime.getMinute()+" minute");
		System.out.println(offTime.getSecond()+" second");
		
	}
}
