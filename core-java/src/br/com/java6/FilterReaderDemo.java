package br.com.java6;

import java.io.BufferedReader;
import java.io.FileReader;

public class FilterReaderDemo {
	public static void main(String args[]) throws Exception {
		FileReader fr = new FileReader("file.txt");
		BufferedReader br = new BufferedReader(fr);
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
		}
		fr.close();
	}
}