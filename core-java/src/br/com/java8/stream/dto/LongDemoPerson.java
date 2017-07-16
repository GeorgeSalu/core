package br.com.java8.stream.dto;

public class LongDemoPerson {
	private String name;
	private long[] luckyNum;

	public LongDemoPerson(String name, long[] luckyNum) {
		this.name = name;
		this.luckyNum = luckyNum;
	}

	public String getName() {
		return name;
	}

	public long[] getLuckyNum() {
		return luckyNum;
	}
}