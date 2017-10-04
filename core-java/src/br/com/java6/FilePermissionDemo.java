package br.com.java6;

import java.io.FilePermission;
import java.io.IOException;
import java.security.PermissionCollection;

public class FilePermissionDemo {
	public static void main(String[] args) throws IOException {
		try {
			String path = "file.txt";
			FilePermission fp1 = new FilePermission("D:/cp/-", "read");
			PermissionCollection pc = fp1.newPermissionCollection();
			pc.add(fp1);
			FilePermission fp2 = new FilePermission(path, "write");
			pc.add(fp2);
			if (pc.implies(new FilePermission(path, "read,write"))) {
				System.out.println("Permission for " + path + " is read and write.");
			} else {
				System.out.println("No read, write permission for " + path);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}