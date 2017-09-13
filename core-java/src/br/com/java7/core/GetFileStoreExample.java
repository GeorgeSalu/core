package br.com.java7.core;

import java.io.IOException;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GetFileStoreExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/cp", "file.txt");
		FileStore fileStore = Files.getFileStore(path);
		System.out.println(fileStore.getTotalSpace());
		System.out.println(fileStore.getUnallocatedSpace());
		System.out.println(fileStore.getUsableSpace());
	}
}