package br.com.java8.core;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalTimeDemo {
	public static void main(String[] args) {
		
		LocalTime localt1 = LocalTime.now();
		System.out.println(localt1);
		
		LocalTime localt2 = LocalTime.now(Clock.systemDefaultZone());
		System.out.println(localt2);
		System.out.println(LocalTime.now(ZoneId.of("Indian/Cocos")));
		System.out.println(LocalTime.now(ZoneId.of("America/Caracas")));
		System.out.println(LocalTime.now(ZoneId.of("Pacific/Norfolk")));
		
	}
}
