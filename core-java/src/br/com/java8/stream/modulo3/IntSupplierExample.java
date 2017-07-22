package br.com.java8.stream.modulo3;

import java.util.function.IntSupplier;

import br.com.java8.stream.dto.Item;

public class IntSupplierExample {
	public static void main(String[] args) {
		
		Item item = new Item(true, 123);
		IntSupplier is = item::getVal;
		System.out.println("Int Value : "+is.getAsInt());
		
	}
}
