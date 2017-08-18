package br.com.java8.core;

import java.util.Optional;

import br.com.java8.core.util.PrimeMinister;

public class OptionalisPresent {
	public static void main(String[] args) {
		
		Optional<PrimeMinister> pm = Optional.of(new PrimeMinister("Narendra Modi"));
		
		System.out.println(pm.isPresent());
		
	}
}
