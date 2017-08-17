package br.com.java8.core;

import java.util.function.Supplier;

import br.com.java8.core.util.Item;

public class SupplierFetchMethod {
	public static void main(String[] args) {
		
		Supplier<String> supplier = Item::getStaticVal;
		String val = supplier.get();
		System.out.println("Calling Method : "+val);
		
	}
}
