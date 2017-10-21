package br.com.java6.core;

import java.util.Locale;

public class LocaleDemo2 {
	public static void main(String[] args) {
		Locale[] locales = { Locale.CANADA, Locale.CANADA_FRENCH, Locale.ENGLISH, Locale.JAPAN };
		for (int i = 0; i < locales.length; i++) {
			System.out.println(locales[i].getCountry());
			System.out.println(locales[i].getDisplayCountry());
			System.out.println(locales[i].getDisplayLanguage());
			System.out.println(locales[i].getDisplayName());
			System.out.println(locales[i].getISO3Country());
		}
	}
}