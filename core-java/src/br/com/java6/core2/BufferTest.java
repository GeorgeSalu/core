package br.com.java6.core2;

import java.io.FileNotFoundException;
import java.nio.ByteBuffer;
import java.nio.LongBuffer;
import java.nio.ShortBuffer;

public class BufferTest {
	public static void main(String[] args) throws FileNotFoundException {
		String s = "12567.545";
		LongBuffer lb = ByteBuffer.wrap(s.getBytes()).asLongBuffer();
		System.out.println(lb.get());

		ShortBuffer sb = ByteBuffer.wrap(s.getBytes()).asShortBuffer();
		System.out.println(sb.get());
	}
}