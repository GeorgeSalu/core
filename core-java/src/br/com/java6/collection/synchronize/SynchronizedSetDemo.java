package br.com.java6.collection.synchronize;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SynchronizedSetDemo {
	public static void main(String[] args) {
		Set<String> obj = new HashSet<>();
		obj.add("Mohan"); 
		Set<String> synObj = Collections.synchronizedSet(obj);
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