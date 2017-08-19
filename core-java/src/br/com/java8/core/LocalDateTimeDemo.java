package br.com.java8.core;

import java.time.Clock;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class LocalDateTimeDemo {
	public static void main(String[] args) {
		
		LocalDateTime localDate1 = LocalDateTime.now();
		System.out.println(localDate1);
		
		LocalDateTime localDate2 = LocalDateTime.now(Clock.systemDefaultZone());
		System.out.println(localDate2);
		System.out.println(LocalDateTime.now(ZoneId.of("Indian/Cocos")));
		System.out.println(LocalDateTime.now(ZoneId.of("America/Caracas")));
		System.out.println(LocalDateTime.now(ZoneId.of("Pacific/Norfolk")));
		
	}
}
