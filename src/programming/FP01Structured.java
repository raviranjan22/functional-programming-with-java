package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		printAllNumbersInListStructured(List.of(1, 2, 3, 4, 5));

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
	}

}
