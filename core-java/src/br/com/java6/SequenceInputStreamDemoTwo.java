package br.com.java6;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInputStreamDemoTwo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis1 = null;
		FileInputStream fis2 = null;
		FileInputStream fis3 = null;
		SequenceInputStream sis = null;
		try {
			fis1 = new FileInputStream(new File("seqFile1.txt"));
			fis2 = new FileInputStream(new File("seqFile2.txt"));
			fis3 = new FileInputStream(new File("seqFile3.txt"));

			Vector<FileInputStream> vector = new Vector();
			vector.add(fis1);
			vector.add(fis2);
			vector.add(fis3);
			Enumeration<FileInputStream> enu = vector.elements();

			sis = new SequenceInputStream(enu);
			int i = 0;
			while ((i = sis.read()) != -1) {
				System.out.print((char) i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			fis1.close();
			fis2.close();
			fis3.close();
			sis.close();
		}
	}
}