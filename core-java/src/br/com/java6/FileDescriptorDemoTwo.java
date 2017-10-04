package br.com.java6;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;

public class FileDescriptorDemoTwo {
	public static void main(String[] a) throws IOException {
		File file = new File("file.txt");
		FileInputStream fis1 = new FileInputStream(file);
		FileDescriptor fd = fis1.getFD();

		FileInputStream fis2 = new FileInputStream(fd);
		int i = 0;
		while ((i = fis2.read()) != -1) {
			System.out.print((char) i);
		}
		fis1.close();
		fis2.close();
	}
}