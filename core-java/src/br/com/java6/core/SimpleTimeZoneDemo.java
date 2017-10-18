package br.com.java6.core;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class SimpleTimeZoneDemo {
	public static void main(String[] args) {
		String[] ids = TimeZone.getAvailableIDs(-6 * 60 * 60 * 1000);
		SimpleTimeZone stz = new SimpleTimeZone(-6 * 60 * 60 * 1000, ids[0]);
		stz.setStartRule(Calendar.MARCH, 1, Calendar.MONDAY, 3 * 60 * 60 * 1000);
		stz.setEndRule(Calendar.NOVEMBER, -1, Calendar.SUNDAY, 3 * 60 * 60 * 1000);
		System.out.println(stz.getDisplayName(Locale.ITALIAN));
		System.out.println(stz.getDisplayName(Locale.ENGLISH));
		System.out.println(stz.getDisplayName(Locale.FRANCE));

		System.out.println(stz.inDaylightTime(new Date()));

		Calendar calendar = new GregorianCalendar(stz);
		Date trialTime = new Date();
		calendar.setTime(trialTime);
	}
}