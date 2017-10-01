package br.com.java6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) {

		PrintWriter pwConsole = new PrintWriter(System.out);
		pwConsole.write("Data to Write on Console using PrintWriter");
		pwConsole.flush();
		pwConsole.close();


		PrintWriter pwFile = null;
		try {
			pwFile = new PrintWriter(new File("D:/cp/text.txt"));
			pwFile.write("Data to Write in File using PrintWriter");
			pwFile.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			pwFile.close();
		}
	}
}