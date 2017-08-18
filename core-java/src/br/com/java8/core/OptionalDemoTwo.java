package br.com.java8.core;

import java.util.Optional;

import br.com.java8.core.util.Country;
import br.com.java8.core.util.Person;
import br.com.java8.core.util.PrimeMinister;

public class OptionalDemoTwo {
	public static void main(String[] args) {
		
		Optional<PrimeMinister> primeMinister = Optional.of(new PrimeMinister("Narenda Modi"));
		Optional<Country> country = Optional.of(new Country(primeMinister));
		Optional<Person> person = Optional.of(new Person(country));
		
		String pmName = person.flatMap(Person::getCountry).flatMap(Country::getPrimeMinister).map(PrimeMinister::getName).orElse("None");
		System.out.println(pmName);
		
	}
}
