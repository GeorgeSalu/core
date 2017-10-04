package br.com.java6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class FilterOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileOutputStream fos = new FileOutputStream(file);
		FilterOutputStream filterOS = new FilterOutputStream(fos);
		byte[] b = "Hello World!".getBytes();
		for (int i = 0; i < b.length; i++) {
			filterOS.write(b[i]);
		}
		fos.close();
		System.out.println("Done");
	}
}