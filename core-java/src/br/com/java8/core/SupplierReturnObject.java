package br.com.java8.core;

import java.util.function.Supplier;

import br.com.java8.core.util.Item;

public class SupplierReturnObject {
	public static void main(String[] args) {
		
		Supplier<Item> supplier = Item::new;
		Item item = supplier.get();	
		System.out.println(item.getMsg());
		
	}
}
