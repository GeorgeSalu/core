package br.com.java7.core;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

public class UserPrincipalExample {
	public static void main(String[] args) throws IOException {
		Path file = Paths.get("D:/cp", "UserPrincipalLookupServiceExample.java");
		UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
		UserPrincipal owner = lookupService.lookupPrincipalByName("arai");
		Files.setOwner(file, owner);
		UserPrincipal userPrincipal = Files.getOwner(file);
		System.out.println(userPrincipal.getName());
	}
}