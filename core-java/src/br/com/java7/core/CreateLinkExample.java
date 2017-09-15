package br.com.java7.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class CreateLinkExample {
	public static void main(String[] args) throws IOException {
		Path existing = Paths.get("d:", "cp", "file.txt");
		Path link = Paths.get("d:", "link");
		Path linkSym = Paths.get("d:", "linkSym");
		Files.createLink(link, existing);
		Files.createSymbolicLink(linkSym, existing);
	}
}