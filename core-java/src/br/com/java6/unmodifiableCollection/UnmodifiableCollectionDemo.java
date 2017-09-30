package br.com.java6.unmodifiableCollection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class UnmodifiableCollectionDemo {
	public static void main(String[] args) {
		
		Collection<String> modifiable = new ArrayList<>();
		modifiable.add("1111");
		
		Collection<String> unmodifiable = Collections.unmodifiableCollection(modifiable);
		
		try{
			unmodifiable.add("222");
		}catch (UnsupportedOperationException e) {
			System.out.println(" UnsupportedOperationException ");
		}
		
		for(String s: unmodifiable) {
			System.out.println(s);
		}
		
	}
}
