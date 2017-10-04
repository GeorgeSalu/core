package br.com.java6;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataInputStreamDemo {
	public static void main(String[] args) throws IOException {
		String file = "file.txt";
		FileInputStream fin = new FileInputStream(file);
		DataInputStream din = new DataInputStream(fin);

		byte b[] = new byte[0];
		din.read(b);

		String val;
		while ((val = din.readLine()) != null) {
			String u = val.toUpperCase();
			System.out.println(u);
		}

		fin.close();
		din.close();
	}
}