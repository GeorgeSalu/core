package br.com.java6.core;

import java.util.Random;

public class RandomDemo {
	public static void main(String[] args) {
		Random random = new Random();

		System.out.println("Random integer number from 0 to 10 ...");
		for (int i = 0; i < 10; i++) {
			int j = random.nextInt(10);
			System.out.println(j);
		}

		System.out.println("Random boolean values...");
		for (int i = 0; i < 5; i++) {
			System.out.println(random.nextBoolean());
		}
	}
}