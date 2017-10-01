package br.com.java6;

import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class LineNumberReaderDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		LineNumberReader lineNumReder = null;
		try {
			System.out.println("Before changing line number\n");
			fr = new FileReader("file.txt");
			lineNumReder = new LineNumberReader(fr);
			String str;
			while ((str = lineNumReder.readLine()) != null) {
				System.out.print(lineNumReder.getLineNumber() + ":");
				System.out.println(str);
			}

			System.out.println("\nAfter changing line number\n");
			fr = new FileReader("file.txt");
			lineNumReder = new LineNumberReader(fr);
			lineNumReder.setLineNumber(10);
			while ((str = lineNumReder.readLine()) != null) {
				System.out.print(lineNumReder.getLineNumber() + ":");
				System.out.println(str);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			fr.close();
			lineNumReder.close();
		}

	}
}