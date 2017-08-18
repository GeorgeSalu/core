package br.com.java8.core;

import java.util.Optional;
import java.util.function.Consumer;

import br.com.java8.core.util.PrimeMinister;

public class OptionalifPresent {
	public static void main(String[] args) {
		
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
		
		Consumer<PrimeMinister> pmComsumer = (PrimeMinister p) -> System.out.println(p.getName());
		pm.ifPresent(pmComsumer);
		
	}
}
