package br.com.java6.core2;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteOrderTest {
	public static void main(String[] args) {
		ByteBuffer bb = ByteBuffer.wrap(new byte[30]);
		bb.asCharBuffer().put("Hellow World!");
		print(bb);
		bb.rewind();
		bb.order(ByteOrder.BIG_ENDIAN);
		bb.asCharBuffer().put("Hellow World!");
		print(bb);
		bb.rewind();
		bb.order(ByteOrder.LITTLE_ENDIAN);
		bb.asCharBuffer().put("Hellow World!");
		print(bb);
	}

	static void print(ByteBuffer bb) {
		while (bb.hasRemaining()) {
			System.out.print(bb.getChar());
		}
	}
}