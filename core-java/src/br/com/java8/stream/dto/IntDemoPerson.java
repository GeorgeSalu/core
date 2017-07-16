package br.com.java8.stream.dto;

public class IntDemoPerson {
	private String name;
	private int[] luckyNum;

	public IntDemoPerson(String name, int[] luckyNum) {
		this.name = name;
		this.luckyNum = luckyNum;
	}

	public String getName() {
		return name;
	}

	public int[] getLuckyNum() {
		return luckyNum;
	}
}