package br.com.java7.core;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class CopyExample {
	public static void main(String[] args) throws IOException {

		// Get the instance of Path of Source File
		Path pathSource = Paths.get("c:/cp", "test.txt");

		// Using Path and OutputStream with Files.copy
		// get the File to be written
		File destFile = new File("c:/temp/newTest1.txt");
		FileOutputStream fos = new FileOutputStream(destFile);

		// copy a file to destination file and returns no of bytes written
		long noOfBytes = Files.copy(pathSource, fos);
		System.out.println(noOfBytes);

		// Using InputStream and Path with Files.copy
		File sourceFile = new File("c:/cp/test.txt");
		FileInputStream fis = new FileInputStream(sourceFile);
		Path destPath1 = Paths.get("c:/temp", "newTest2.txt");

		noOfBytes = Files.copy(fis, destPath1, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(noOfBytes);

		// Using Path for source and destination of file with Files.copy
		Path destPath2 = Paths.get("c:/temp", "newTest3.txt");
		Path target = Files.copy(pathSource, destPath2, StandardCopyOption.REPLACE_EXISTING);
		System.out.println(target.getFileName());
	}
}