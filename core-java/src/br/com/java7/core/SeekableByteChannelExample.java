package br.com.java7.core;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SeekableByteChannelExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/cp", "file1.txt");
		SeekableByteChannel sbc = Files.newByteChannel(path, StandardOpenOption.READ);
		ByteBuffer bf = ByteBuffer.allocate(1024);
		int i = 0;
		while ((i = sbc.read(bf)) > 0) {
			bf.flip();
			System.out.println(i);
			bf.clear();

		}
	}
}