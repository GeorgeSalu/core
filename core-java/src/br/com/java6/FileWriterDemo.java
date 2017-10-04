package br.com.java6;

import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException {
		CharArrayWriter out = new CharArrayWriter();
		out.write("Hello World!");
		FileWriter f = new FileWriter(new File("file.txt"));
		out.writeTo(f);
		out.close();
		f.close();
		System.out.println("Done");
	}
}