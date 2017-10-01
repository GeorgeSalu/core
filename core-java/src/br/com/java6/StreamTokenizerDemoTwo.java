package br.com.java6;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerDemoTwo {
	public static void main(String args[]) throws IOException {

		FileReader fileReader = new FileReader("file2.txt");
		StreamTokenizer st = new StreamTokenizer(fileReader);
		System.out.println("After Using ordinaryChar() method \n");
		st.ordinaryChar('A');
		printStreamTokenizer(st);
		fileReader.close();

		fileReader = new FileReader("file2.txt");
		st = new StreamTokenizer(fileReader);
		System.out.println("\nAfter Using resetSyntax() method \n");
		st.resetSyntax();
		printStreamTokenizer(st);
		fileReader.close();
	}

	static void printStreamTokenizer(StreamTokenizer st) throws IOException {
		int token = 0;
		while ((token = st.nextToken()) != StreamTokenizer.TT_EOF) {
			if (st.ttype == StreamTokenizer.TT_NUMBER) {
				System.out.println("Number: " + st.nval);
			} else if (st.ttype == StreamTokenizer.TT_WORD) {
				System.out.println("Word: " + st.sval);
			} else {
				System.out.println("Ordinary Char: " + (char) token);
			}
		}
	}
}