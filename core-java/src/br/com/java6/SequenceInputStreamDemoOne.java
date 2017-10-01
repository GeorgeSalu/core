package br.com.java6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamDemoOne {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		SequenceInputStream sis = null;
		try {
			fis1 = new FileInputStream(new File("seqFile1.txt"));
			fis2 = new FileInputStream(new File("seqFile1.txt"));
			sis = new SequenceInputStream(fis1, fis2);
			int i = 0;
			while ((i = sis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis1.close();
			fis2.close();
			sis.close();
		}
	}
}