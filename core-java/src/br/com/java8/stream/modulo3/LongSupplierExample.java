package br.com.java8.stream.modulo3;

import java.util.function.LongSupplier;

import br.com.java8.stream.dto.Item;

public class LongSupplierExample {
	public static void main(String[] args) {
		
		Item item = new Item(true, 123);
		LongSupplier ls = item::getVal;
		System.out.println("Long Value : "+ls.getAsLong());
		
	}
}
