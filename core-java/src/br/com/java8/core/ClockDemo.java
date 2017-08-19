package br.com.java8.core;

import java.time.LocalDate;

public class ClockDemo {
	public static void main(String[] args) {
		
		IClockInjector clockInjector = new SystemDefaultZoneInjector();
		IProcessClock processClock = clockInjector.getDemoClockInstance();
		processClock.process(LocalDate.MAX);
		
		clockInjector = new SystemUTCInjector();
		processClock = clockInjector.getDemoClockInstance();
		processClock.process(LocalDate.now());
		
	}
}
