package br.com.java6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileInputStream fis = new FileInputStream(file);

		int i = 0;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
		System.out.println();
		fis.close();

		fis = new FileInputStream(file);
		byte[] b = new byte[256];
		while ((i = fis.read(b)) != -1) {
			System.out.print(new String(b));
		}
		fis.close();
	}
}