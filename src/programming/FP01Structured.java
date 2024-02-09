package programming;

import java.util.List;

public class FP01Structured {

	public static void main(String[] args) {
		
		//printAllNumbersInListStructured(List.of(1, 2, 3, 4, 5));//Extract value to local value:Alt+Shift+L
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		printAllNumbersInListStructured(numbers);
		printEvenNumbersInListStructured(numbers);

	}

	private static void printAllNumbersInListStructured(List<Integer> numbers) {
		for(Integer number:numbers) {
			System.out.println(number);
		}
		
	}
	
	private static void printEvenNumbersInListStructured(List<Integer> numbers) {
		for(Integer number:numbers) {
			if(number%2==0)
				System.out.println(number);
		}
	}

}
