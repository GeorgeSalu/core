package br.com.java6;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileDescriptorDemoOne {
	public static void main(String[] args) throws IOException {
		File file = new File("file.txt");
		FileOutputStream fos1 = new FileOutputStream(file);
		FileDescriptor fd = fos1.getFD();

		FileOutputStream fos2 = new FileOutputStream(fd);
		fos2.write("Hello World!".getBytes());
		fos1.close();
		fos2.close();
	}
}