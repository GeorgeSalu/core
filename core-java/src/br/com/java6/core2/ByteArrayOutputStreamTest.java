package br.com.java6.core2;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamTest {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream baos = null;
		baos = new ByteArrayOutputStream();
		String s = "Hello World!";
		baos.write(s.getBytes());
		byte[] b = baos.toByteArray();
		for (int i = 0; i < b.length; i++) {
			System.out.print(new Character((char) b[i]));
		}
	}
}