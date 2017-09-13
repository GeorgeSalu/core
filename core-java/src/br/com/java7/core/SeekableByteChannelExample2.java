package br.com.java7.core;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class SeekableByteChannelExample2 {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/cp", "file.txt");
		SeekableByteChannel sbc = Files.newByteChannel(path, StandardOpenOption.APPEND);
		String s = "Hellow World!";
		ByteBuffer bfSrc = ByteBuffer.wrap(s.getBytes());
		sbc.write(bfSrc);
		sbc.close();
	}
}