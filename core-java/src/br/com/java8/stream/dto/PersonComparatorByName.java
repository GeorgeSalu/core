package br.com.java8.stream.dto;

import java.util.Comparator;

public class PersonComparatorByName implements Comparator<PersonList>{

	@Override
	public int compare(PersonList o1, PersonList o2) {
		return o1.getName().compareTo(o2.getName());
	}

}
