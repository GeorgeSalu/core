package br.com.java6.core2;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fin = null;
		FileChannel fchannel = null;
		try {

			fin = new FileInputStream("C:/temp/test.txt");

			fchannel = fin.getChannel();

			ByteBuffer byteBuffer = ByteBuffer.allocate(512);

			while (fchannel.read(byteBuffer) > 0) {

				byteBuffer.flip();

				while (byteBuffer.hasRemaining()) {
					char ch = (char) byteBuffer.get();
					System.out.print(ch);
				}

				byteBuffer.clear();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fin.close();
			fchannel.close();
		}
	}
}