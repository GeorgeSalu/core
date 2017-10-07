package br.com.java6.core2;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ByteArrayInputStreamTest {
	public static void main(String[] args) {
		String str = "Hello World! \nThis is BufferedReader Program.";
		byte buff[] = str.getBytes();
		InputStream is = new ByteArrayInputStream(buff);
		try {
			while (is.available() != 0) {
				System.out.print(new Character((char) is.read()));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}