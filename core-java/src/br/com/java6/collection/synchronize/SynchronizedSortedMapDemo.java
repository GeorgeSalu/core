package br.com.java6.collection.synchronize;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SynchronizedSortedMapDemo {
	public static void main(String[] args) {
		SortedMap<Integer, String> obj = new TreeMap<>();
		obj.put(1, "Mohan"); 
		SortedMap<Integer, String> synObj = Collections.synchronizedSortedMap(obj);
		synObj.put(2, "Sohan"); 
		Set<Integer> set = synObj.keySet(); 

		Iterator<Integer> ite1 = set.iterator();
		while (ite1.hasNext()) {
			String s = obj.get(ite1.next());
			System.out.println(s);
		}

		synchronized (synObj) {
			Iterator<Integer> ite2 = set.iterator();
			while (ite2.hasNext()) {
				String s = obj.get(ite2.next());
				System.out.println(s);
			}
		}
	}
}