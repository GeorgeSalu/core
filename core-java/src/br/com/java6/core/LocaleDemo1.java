package br.com.java6.core;

import java.util.Locale;

public class LocaleDemo1 {
	public static void main(String[] args) {
		Locale locale = new Locale("en", "US");
		System.out.println(locale.getCountry());
		System.out.println(locale.getDisplayCountry());
		System.out.println(locale.getDisplayLanguage());
		System.out.println(locale.getDisplayName());
		System.out.println(locale.getISO3Country());
	}
}