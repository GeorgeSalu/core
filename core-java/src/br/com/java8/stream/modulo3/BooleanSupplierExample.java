package br.com.java8.stream.modulo3;

import java.util.function.BooleanSupplier;

import br.com.java8.stream.dto.Item;

public class BooleanSupplierExample {
	public static void main(String[] args) {
		
		Item item = new Item(true, 123);
		BooleanSupplier bs = item::isStatus;
		System.out.println("Status : "+bs.getAsBoolean());
		
	}
}
