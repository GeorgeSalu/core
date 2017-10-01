package br.com.java6;

import java.io.CharArrayReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderDemo {
	public static void main(String[] args) {
		char charArray[] = { 'a', '-', '-', 'b', '-', 'c', 'b', '-', '-', '-', 'a', 'b' };
		CharArrayReader chARed = new CharArrayReader(charArray);
		PushbackReader pbr = new PushbackReader(chARed);
		int c;
		try {
			while ((c = pbr.read()) != -1) {
				if (c == '-') {
					int nextC;
					if ((nextC = pbr.read()) == '-') {
						System.out.print("**");
					} else {
						// push backs a single character
						pbr.unread(nextC);
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