package br.com.java6.core2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		String str = "Hello World! \nThis is BufferedReader Program.";
		Reader sr = new StringReader(str);
		BufferedReader br = null;
		try {
			br = new BufferedReader(sr);
			String s = br.readLine();
			while (s != null) {
				System.out.println(s);
				s = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}