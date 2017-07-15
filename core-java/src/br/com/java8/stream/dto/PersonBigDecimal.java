package br.com.java8.stream.dto;

import java.math.BigDecimal;

public class PersonBigDecimal {

	private String name;
	private BigDecimal weight;

	public PersonBigDecimal(String name, BigDecimal weight) {
		this.name = name;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getWeight() {
		return weight;
	}

	public void setWeight(BigDecimal weight) {
		this.weight = weight;
	}

}
