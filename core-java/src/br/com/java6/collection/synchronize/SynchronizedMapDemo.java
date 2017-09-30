package br.com.java6.collection.synchronize;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SynchronizedMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> obj = new HashMap<>();
		obj.put(1, "Mohan"); 
		Map<Integer, String> synObj = Collections.synchronizedMap(obj);
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