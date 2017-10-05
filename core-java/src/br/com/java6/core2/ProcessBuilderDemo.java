package br.com.java6.core2;

import java.io.File;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;

public class ProcessBuilderDemo {
	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder processBuilder = new ProcessBuilder("D:/test.bat", "ABC", "XYZ");
		processBuilder.directory(new File("D:/"));
		File log = new File("D:/log.txt");
		processBuilder.redirectErrorStream(true);
		processBuilder.redirectOutput(Redirect.appendTo(log));
		Process p = processBuilder.start();
		p.waitFor();
		System.out.println("Done");
	}
}