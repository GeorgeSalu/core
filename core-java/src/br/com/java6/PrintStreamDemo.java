package br.com.java6;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class PrintStreamDemo {
	public static void main(String[] args) {

		PrintStream psConsole = new PrintStream(System.out);
		try {
			psConsole.write("Data to Write on Console using PrintStream".getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
		psConsole.flush();
		psConsole.close();


		PrintStream pwFile = null;
		try {
			pwFile = new PrintStream(new File("D:/cp/text.txt"));
			pwFile.write("Data to Write in File using PrintStream".getBytes());
			pwFile.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			pwFile.close();
		}
	}
}