package br.com.java8.stream.dto;

public class DoubleDemoPerson {
	private String name;
	private double[] weightsInAYear;

	public DoubleDemoPerson(String name, double[] weightsInAYear) {
		this.name = name;
		this.weightsInAYear = weightsInAYear;
	}

	public String getName() {
		return name;
	}

	public double[] getWeightsInAYear() {
		return weightsInAYear;
	}
}