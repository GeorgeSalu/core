package br.com.java6.collection.synchronize;

import java.util.Collections;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SynchronizedSortedSetDemo {
	public static void main(String[] args) {
		SortedSet<String> obj = new TreeSet<>();
		obj.add("Mohan"); 
		SortedSet<String> synObj = Collections.synchronizedSortedSet(obj);
		synObj.add("Ganesh"); 

		Iterator<String> ite1 = synObj.iterator();
		while (ite1.hasNext()) {
			String s = ite1.next();
			System.out.println(s);
		}

		synchronized (synObj) {
			Iterator<String> ite2 = synObj.iterator();
			while (ite2.hasNext()) {
				String s = ite2.next();
				System.out.println(s);
			}
		}
	}
}