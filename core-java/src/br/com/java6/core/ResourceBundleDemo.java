package br.com.java6.core;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleDemo {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ResourceBundle rb = ResourceBundle.getBundle("br.com.java6.core.SampleResources", Locale.ENGLISH);
		Enumeration<String> en = rb.getKeys();
		while (en.hasMoreElements()) {
			String key = en.nextElement();
			System.out.println("key:" + key + " Values:" + rb.getString(key));
		}
	}
}