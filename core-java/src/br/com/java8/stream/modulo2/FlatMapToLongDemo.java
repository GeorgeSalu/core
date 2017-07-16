package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

import br.com.java8.stream.dto.LongDemoPerson;

public class FlatMapToLongDemo {
	public static void main(String[] args) {
		
		long[][] data = {{1L,2L},{3L,4L},{5L,6L}};
		LongStream ls1 = Arrays.stream(data).flatMapToLong(row -> Arrays.stream(row));
		System.out.println(ls1.sum());
		
		long[] l1 = {4l,8l,9l};
		LongDemoPerson p1 = new LongDemoPerson("Ram", l1);
		long[] l2 = {2l,7l,8l};
		LongDemoPerson p2 = new LongDemoPerson("Shyam", l2);		
		List<LongDemoPerson> list = Arrays.asList(p1,p2);
		LongStream ls2 = list.stream().flatMapToLong(row -> Arrays.stream(row.getLuckyNum()));
		System.out.println(ls2.min().getAsLong());
		
	}
}
