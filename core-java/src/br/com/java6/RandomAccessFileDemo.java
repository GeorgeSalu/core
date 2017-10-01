package br.com.java6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raFile = null;
		try {
			raFile = new RandomAccessFile("D:/cp/text.txt", "rw");
			int i = 0;
			try {

				raFile.write("This is example.".getBytes());

				raFile.seek(raFile.getFilePointer() - 8);

				raFile.write("RandomAccessFile example".getBytes());

				raFile.seek(0);
				while ((i = raFile.read()) != -1) {
					System.out.print((char) i);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			raFile.close();
		}
	}
}