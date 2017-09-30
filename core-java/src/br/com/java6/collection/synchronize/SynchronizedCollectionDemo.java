package br.com.java6.collection.synchronize;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class SynchronizedCollectionDemo {
	public static void main(String[] args) {
		
		Collection<String> obj = new ArrayList<>();
		obj.add("Mohan");
		Collection<String> synObj = Collections.synchronizedCollection(obj);
		synObj.add("Ganesh");
		
		Iterator<String> ite1 = synObj.iterator();
		while(ite1.hasNext()) {
			String s = ite1.next();
			System.out.println(s);
		}
		
		synchronized (synObj) {
			Iterator<String> ite2 = synObj.iterator();
			while(ite2.hasNext()) {
				String s = ite2.next();
				System.out.println(s);
			}
		}
		
	}
}
