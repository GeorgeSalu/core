package br.com.java7.core;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

public class PathMatcherExample2 {
	public static void main(String[] args) {
		FileSystem fileSystem = FileSystems.getDefault();
		PathMatcher pathMatcher = fileSystem.getPathMatcher("glob:**.{java,class,txt}");
		Path path = Paths.get("D:/cp/file.txt");
		System.out.println(pathMatcher.matches(path));
	}
}