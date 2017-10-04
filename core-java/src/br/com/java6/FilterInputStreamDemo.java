package br.com.java6;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

public class FilterInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileInputStream fis = new FileInputStream(file);
		FilterInputStream filterIs = new BufferedInputStream(fis);
		int i = 0;
		while ((i = filterIs.read()) != -1) {
			System.out.print((char) i);
		}
		fis.close();
		filterIs.close();
	}
}