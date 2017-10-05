package br.com.java6.core2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;

public class PipeTest {
	public static void main(String[] args) throws IOException {

		Pipe pipe = Pipe.open();

		Pipe.SinkChannel skChannel = pipe.sink();

		String testData = "Test Data to Check java NIO Channels Pipe.";

		ByteBuffer buffer = ByteBuffer.allocate(512);
		buffer.clear();
		buffer.put(testData.getBytes());

		buffer.flip();
		while (buffer.hasRemaining()) {
			skChannel.write(buffer);
		}

		Pipe.SourceChannel sourceChannel = pipe.source();
		buffer = ByteBuffer.allocate(512);

		while (sourceChannel.read(buffer) > 0) {

			buffer.flip();

			while (buffer.hasRemaining()) {
				char ch = (char) buffer.get();
				System.out.print(ch);
			}

			buffer.clear();
		}

	}
}