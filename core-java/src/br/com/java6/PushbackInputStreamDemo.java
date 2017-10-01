package br.com.java6;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PushbackInputStream;

public class PushbackInputStreamDemo {
	public static void main(String[] args) {
		String strExp = "a--b-cb---ab";
		byte bytes[] = strExp.getBytes();
		ByteArrayInputStream bais = new ByteArrayInputStream(bytes);
		PushbackInputStream pbis = new PushbackInputStream(bais);
		int c;
		try {
			while ((c = pbis.read()) != -1) {
				if (c == '-') {
					int nextC;
					if ((nextC = pbis.read()) == '-') {
						System.out.print("**");
					} else {
						// push backs one byte
						pbis.unread(nextC);
						System.out.print((char) c);
					}
				} else {
					System.out.print((char) c);
				}
			}
		} catch (IOException ioe) {
			System.out.println("Exception while reading" + ioe);
		}
	}
}