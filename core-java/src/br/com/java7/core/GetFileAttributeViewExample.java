package br.com.java7.core;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.AclEntry;
import java.nio.file.attribute.AclFileAttributeView;
import java.util.List;

public class GetFileAttributeViewExample {
	public static void main(String[] args) throws IOException {
		Path path = Paths.get("D:/cp", "file.txt");
		AclFileAttributeView view = Files.getFileAttributeView(path, AclFileAttributeView.class);
		if (view != null) {
			List<AclEntry> acls = view.getAcl();
			for (AclEntry acl : acls) {
				System.out.println(acl.principal().getName() + ":" + acl.type());
			}
		}
	}
}