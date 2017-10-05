package br.com.java6.core2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

public class ChannelsTest {
	public static void main(String[] args) throws IOException {
		InputStream in = null;
		ReadableByteChannel channel = null;
		try {
			in = new FileInputStream("C:/temp/test.txt");

			channel = Channels.newChannel(in);

			ByteBuffer byteBuffer = ByteBuffer.allocate(512);

			while (channel.read(byteBuffer) > 0) {

				byteBuffer.flip();

				while (byteBuffer.hasRemaining()) {
					char ch = (char) byteBuffer.get();
					System.out.print(ch);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			in.close();
			channel.close();
		}
	}
}