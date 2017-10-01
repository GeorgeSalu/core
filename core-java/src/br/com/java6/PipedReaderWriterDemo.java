package br.com.java6;

import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PipedReaderWriterDemo {
	final static PipedWriter pipedWriter = new PipedWriter();
	final static PipedReader pipedReader = new PipedReader();
	final char c[] = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };

	class PipedWriterThread implements Runnable {
		@Override
		public void run() {
			try {
				pipedWriter.write(c);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	class PipedReaderThread implements Runnable {
		@Override
		public void run() {
			try {
				int i = 0;
				while ((i = pipedReader.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		try {
			pipedWriter.connect(pipedReader);
		} catch (IOException e) {
			e.printStackTrace();
		}
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.execute(new PipedReaderWriterDemo().new PipedWriterThread());
		service.execute(new PipedReaderWriterDemo().new PipedReaderThread());
	}
}