package br.com.java6.core2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class BufferedWriterTest {
	public static void main(String[] args) {
		File file = new File("C:\\test.txt");
		String str = "Hello World! \nThis is BufferedReader Program.";
		BufferedWriter bw = null;
		try {
			Writer w = new OutputStreamWriter(new FileOutputStream(file));
			bw = new BufferedWriter(w);
			bw.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("Done");
	}
}