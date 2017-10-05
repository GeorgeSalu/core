package br.com.java6.core2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

public class CharsetExample {
	public static void main(String[] args) {
		Charset charset = Charset.forName("US-ASCII");
		System.out.println(charset.displayName());
		System.out.println(charset.canEncode());
		String s = "Hello, This is Charset Example.";

		ByteBuffer bb = ByteBuffer.wrap(s.getBytes());
		CharBuffer cb = charset.decode(bb);

		ByteBuffer newbb = charset.encode(cb);
		while (newbb.hasRemaining()) {
			char ch = (char) newbb.get();
			System.out.print(ch);
		}
		newbb.clear();
	}
}