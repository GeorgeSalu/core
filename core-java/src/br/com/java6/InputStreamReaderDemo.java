package br.com.java6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderDemo {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		int a = 0;
		int b = 0;
		try {
			System.out.println("Enter a number..");
			a = Integer.parseInt(br.readLine());
			System.out.println("Enter another number..");
			b = Integer.parseInt(br.readLine());

		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("you enterd " + a + " and  " + b);
	}
}