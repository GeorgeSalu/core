package br.com.java6;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamDemo {
	public static void main(String[] args) throws IOException {
		String strFile = "file.txt";
		FileOutputStream fos = new FileOutputStream(strFile);
		DataOutputStream dos = new DataOutputStream(fos);
		int num = 100;
		dos.writeInt(num);
		dos.flush();
		dos.close();
		System.out.println("Done");
	}
}