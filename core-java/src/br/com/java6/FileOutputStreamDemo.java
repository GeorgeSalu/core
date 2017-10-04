package br.com.java6;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileOutputStream fos = new FileOutputStream(file);

		fos.write("Hello World! ".getBytes());

		fos.write("Hello World!".getBytes(), 6, 6);

		byte[] b = " Hello World!".getBytes();
		for (int i = 0; i < b.length; i++) {
			fos.write(b[i]);
		}
		fos.close();
		System.out.println("Done");
	}
}