package br.com.java8.stream.dto;

public class UserParallel implements Comparable<UserParallel> {

	private String name;
	private int age;

	public UserParallel(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(UserParallel UserParallel) {
		return name.compareTo(UserParallel.name);
	}

	public static UserParallel[] getUserParallels() {
		UserParallel[] UserParallels = new UserParallel[6];
		UserParallels[0] = new UserParallel("Ram", 25);
		UserParallels[1] = new UserParallel("Shyam", 22);
		UserParallels[2] = new UserParallel("Mohan", 21);
		UserParallels[3] = new UserParallel("Suresh", 30);
		UserParallels[4] = new UserParallel("Ramesh", 20);
		UserParallels[5] = new UserParallel("Dinesh", 27);
		return UserParallels;
	}

}
