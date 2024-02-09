package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		printAllNumbersInListFunctional(numbers);
		printEvenNumbersInListFunctional(numbers);

	}
	
	/*
	 * public static void print(int number) { System.out.println(number); }
	 */

	private static boolean isEven(int number) {
		return number%2==0;
	}
	
	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		//numbers.stream().forEach(FP01Functional::print);//Reference method
		numbers.stream().forEach(System.out::println);
		
	}
	
	private static void printEvenNumbersInListFunctional(List<Integer> numbers) {
		//numbers.stream().forEach(FP01Functional::print);//Reference method
		numbers.stream()
		.filter(FP01Functional::isEven)
		.forEach(System.out::println);
		
	}

}
