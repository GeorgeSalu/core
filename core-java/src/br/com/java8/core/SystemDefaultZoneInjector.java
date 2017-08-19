package br.com.java8.core;

import java.time.Clock;

public class SystemDefaultZoneInjector implements IClockInjector {

	@Override
	public IProcessClock getDemoClockInstance() {
		return new ProcessClock(Clock.systemDefaultZone());
	}

}
