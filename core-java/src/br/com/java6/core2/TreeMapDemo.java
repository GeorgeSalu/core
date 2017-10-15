package br.com.java6.core2;

import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author george
 *
 */
public class TreeMapDemo {
	
	public static void main(String[] args) {
		SortedMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1, "A");
		map.put(3, "C");
		map.put(2, "B");

		Set<Entry<Integer, String>> ob = map.entrySet();
		for (Entry<Integer, String> en : ob) {
			System.out.print(en.getKey());
			System.out.println(en.getValue());
		}
	}
}