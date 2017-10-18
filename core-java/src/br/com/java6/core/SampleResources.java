package br.com.java6.core;

import java.util.ListResourceBundle;

public class SampleResources extends ListResourceBundle {
	protected Object[][] getContents() {
		return new Object[][] { { "user.name", "Ram" }, { "user.age", "21" }, { "user.city", "Varanasi" } };
	}
}