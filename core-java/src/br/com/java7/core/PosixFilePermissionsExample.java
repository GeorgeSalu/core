package br.com.java7.core;

import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFilePermissionsExample {
	public static void main(String[] args) {
		Set<PosixFilePermission> perms = PosixFilePermissions.fromString("rwxr-x--x");
		FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(perms);
		System.out.println(fileAttributes.value());
	}
}