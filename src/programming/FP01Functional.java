package programming;

import java.util.List;

public class FP01Functional {

	public static void main(String[] args) {
		
		printAllNumbersInListFunctional(List.of(1, 2, 3, 4, 5));

	}
	
	public static void print(int number) {
		System.out.println(number);
	}

	private static void printAllNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream().forEach(FP01Functional::print);//Reference method
		
	}

}
