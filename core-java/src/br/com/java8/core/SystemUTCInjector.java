package br.com.java8.core;

import java.time.Clock;

public class SystemUTCInjector implements IClockInjector {

	@Override
	public IProcessClock getDemoClockInstance() {
		return new ProcessClock(Clock.systemUTC());
	}

}
