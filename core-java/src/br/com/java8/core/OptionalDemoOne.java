package br.com.java8.core;

import java.util.Optional;

import br.com.java8.core.util.PrimeMinister;

public class OptionalDemoOne {
	public static void main(String[] args) {
		
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister());
		String pmName = pm.map(PrimeMinister::getName).orElse("None");
		System.out.println(pmName);
		
		pm = Optional.of(new PrimeMinister("Narendra Modi"));
		pmName = pm.map(PrimeMinister::getName).orElse("None");
		System.out.println(pmName);
		
	}
}
