package br.com.java6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class OutputStreamWriterDemo {
	public static void main(String[] args) {
		String str = "Hello World! \nThis is OutputStreamWriter Code Example.";
		BufferedWriter bw = null;
		try {
			Writer w = new OutputStreamWriter(System.out);
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
	}
}