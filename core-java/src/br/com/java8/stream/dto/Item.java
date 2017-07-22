package br.com.java8.stream.dto;

public class Item {
	private Boolean status;
	private Integer val;

	public Item(Boolean status, Integer val) {
		this.status = status;
		this.val = val;
	}

	public Boolean isStatus() {
		return status;
	}

	public Integer getVal() {
		return val;
	}
}
