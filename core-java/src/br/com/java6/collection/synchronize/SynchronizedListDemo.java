package br.com.java6.collection.synchronize;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SynchronizedListDemo {
	public static void main(String[] args) {
		List<String> obj = new ArrayList<>();
		obj.add("Mohan"); // not thread safe
		List<String> synObj = Collections.synchronizedList(obj);
		synObj.add("Ganesh"); // thread safe

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
