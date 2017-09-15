package br.com.java7.core;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Calendar;
import java.util.Set;

public class CreateFileExample {
	public static void main(String[] args) throws IOException {
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxrwx--x");
		FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
		Path path = Paths.get("d:", "cp", "file.txt");

		// will not work on windows
		// Files.createFile(path, fileAttributes);

		// creates a file
		Files.createFile(path);

		// Create temp file in default location
		File.createTempFile("concretepage", String.valueOf(Calendar.getInstance().getTime().getTime()));
	}
}