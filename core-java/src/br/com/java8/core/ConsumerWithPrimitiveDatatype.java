package br.com.java8.core;

import java.util.Arrays;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

public class ConsumerWithPrimitiveDatatype {
	public static void main(String[] args) {
		
		System.out.println("--- IntConsumer ---");
		int[] intNum = {3,5,6,10,15};
		IntConsumer intCon = i -> System.out.println(i + " ");
		Arrays.stream(intNum).forEach(intCon);
		
		System.out.println("\n --- LongConsumer -----");
		long[] longNum = {13l,9l,6l,15l};
		LongConsumer longCon = l -> System.out.println(l + " ");
		Arrays.stream(longNum).forEach(longCon);
		
		System.out.println("\n ---- DoubleConsumer ---");
		double[] dbNum = {13.4d, 9.1d,6.5d,10.3d,15.3d};
		DoubleConsumer dbCon = d -> System.out.println(d + " ");
		Arrays.stream(dbNum).forEach(dbCon);
		
	}
}
