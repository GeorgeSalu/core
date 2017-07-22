package br.com.java8.stream.modulo4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import br.com.java8.stream.dto.StudentUnaryOperator;

public class MaxByMinBy {
	public static void main(String[] args) {
		StudentUnaryOperator s1 = new StudentUnaryOperator("Shyam", 22, "A");
		StudentUnaryOperator s2 = new StudentUnaryOperator("Ram", 23, "A");
		StudentUnaryOperator s3 = new StudentUnaryOperator("Mohan", 22, "B");
		StudentUnaryOperator s4 = new StudentUnaryOperator("Ramesh", 21, "B");
		List<StudentUnaryOperator> list = Arrays.asList(s1, s2, s3, s4);
		Comparator<StudentUnaryOperator> ageComparator = Comparator.comparing(StudentUnaryOperator::getAge);
		// Using BinaryOperator.maxBy
		System.out.println("---BinaryOperator.maxBy---");
		Map<String, Optional<StudentUnaryOperator>> eldestByClass = list.stream().collect(
				Collectors.groupingBy(StudentUnaryOperator::getClassName, Collectors.reducing(BinaryOperator.maxBy(ageComparator))));
		eldestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
				+ ((Optional<StudentUnaryOperator>) v).get().getAge() + " Name:" + ((Optional<StudentUnaryOperator>) v).get().getName()));

		// Using BinaryOperator.minBy
		System.out.println("---BinaryOperator.minBy---");
		Map<String, Optional<StudentUnaryOperator>> youngestByClass = list.stream().collect(
				Collectors.groupingBy(StudentUnaryOperator::getClassName, Collectors.reducing(BinaryOperator.minBy(ageComparator))));
		youngestByClass.forEach((k, v) -> System.out.println("Class:" + k + " Age:"
				+ ((Optional<StudentUnaryOperator>) v).get().getAge() + " Name:" + ((Optional<StudentUnaryOperator>) v).get().getName()));
	}
}