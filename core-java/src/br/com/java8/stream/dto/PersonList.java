package br.com.java8.stream.dto;

public class PersonList {

	private int pid;
	private String name;

	public PersonList() {
	}

	public PersonList(int pid, String name) {
		this.pid = pid;
		this.name = name;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
