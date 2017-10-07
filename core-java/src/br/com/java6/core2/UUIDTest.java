package br.com.java6.core2;

import java.util.UUID;

public class UUIDTest {
	public static final void main(String... aArgs) {
		UUID id = null;
		for (int i = 0; i < 5; i++) {
			// generate random UUIDs
			id = UUID.randomUUID();
			System.out.println(id);
		}
	}
}