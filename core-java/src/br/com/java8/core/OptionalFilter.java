package br.com.java8.core;

import java.util.Optional;
import java.util.function.Predicate;

import br.com.java8.core.util.PrimeMinister;

public class OptionalFilter {
	public static void main(String[] args) {
		
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
		Predicate<PrimeMinister> pmPredicate = p -> p.getName().length() > 15;
		System.out.println(pm.filter(pmPredicate));
		
	}
}
