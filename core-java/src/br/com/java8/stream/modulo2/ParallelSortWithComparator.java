package br.com.java8.stream.modulo2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Consumer;

import br.com.java8.stream.dto.UserParallel;

public class ParallelSortWithComparator {
	public static void main(String[] args) {
		
		UserParallel[] users = UserParallel.getUserParallels();
		Comparator<UserParallel> ageComparator = Comparator.comparing(UserParallel::getAge);
		System.out.println("--- Sort complete array ----");
		
		Arrays.parallelSort(users,ageComparator);
		Consumer<UserParallel> printUser = u -> System.out.println(u.getName() + " - "+u.getAge());
		Arrays.stream(users).forEach(printUser);
		System.out.println("--- Sort array from index 1 to 4");

		users = UserParallel.getUserParallels();
		Arrays.parallelSort(users,1,4,ageComparator);
		Arrays.stream(users).forEach(printUser);
		
	}
}
