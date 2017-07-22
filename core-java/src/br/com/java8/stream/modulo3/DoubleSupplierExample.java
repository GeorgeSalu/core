package br.com.java8.stream.modulo3;

import java.util.function.DoubleSupplier;

import br.com.java8.stream.dto.Item;

public class DoubleSupplierExample {
	public static void main(String[] args) {
		
		Item item = new Item(true, 123);
		DoubleSupplier ds = item::getVal;
		System.out.println("Double value : "+ds.getAsDouble());
		
	}
}
