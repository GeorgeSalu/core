package br.com.java6.core2;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamDemo {
	public static void main(String[] args) {
		File file = new File("C:\\test.txt");
		BufferedInputStream bis = null;
		try {
			bis = new BufferedInputStream(new FileInputStream(file));
			while (bis.available() != 0) {
				System.out.print(new Character((char) bis.read()));
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}