package br.com.java8.core;

import java.time.Clock;
import java.time.Instant;

public class InstantDemo {
	public static void main(String[] args) {
		
		Instant inst1 = Instant.now();
		System.out.println(inst1.getEpochSecond());
		
		Instant inst2 = Instant.EPOCH;
		System.out.println(inst1.isAfter(inst2));
		
		Instant inst3 = Instant.now(Clock.systemUTC());
		System.out.println(inst3.isAfter(inst1));
		System.out.println(Instant.MAX.getNano());
		System.out.println(Instant.MIN.getNano());
		
		
	}
}
