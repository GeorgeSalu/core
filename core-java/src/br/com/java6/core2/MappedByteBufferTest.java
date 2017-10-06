package br.com.java6.core2;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class MappedByteBufferTest {
	public static void main(String[] args) {
		try {
			RandomAccessFile rafile = new RandomAccessFile("C:/temp/test.txt", "rw");
			FileChannel fileChannel = rafile.getChannel();
			MappedByteBuffer mbb = fileChannel.map(FileChannel.MapMode.READ_WRITE, 0, 1024);
			String msg = "Hellow World!";
			mbb.put(msg.getBytes());
			mbb.force();
			fileChannel.close();
			rafile.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
