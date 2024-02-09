package programming;

import java.util.List;

public class FP01Excercises {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		printOddNumbersInListFunctional(numbers);
		
		List<String> courses = List.of("Java", "Data Science Fundamentals", "GCP", "Introduction to Psychology", "Financial Accounting Principles", "Graphic Design Basics", "Machine Learning for Beginners", "Effective Communication Skills", "Introduction to Astrophysics", "Entrepreneurship and Business Strategy");
		
		System.out.println("Printing each corse line by line************");
		courses.stream()
		.forEach(System.out::println);
		
		System.out.println("Printing courses containg Data only************");
		courses.stream()
		.filter(course -> course.contains("Data"))
		.forEach(System.out::println);
		
		System.out.println("Printing courses containg length greater thean 4***********");
		courses.stream()
		.filter(course -> course.length()>4)
		.forEach(System.out::println);
	}
	
	private static void printOddNumbersInListFunctional(List<Integer> numbers) {
		numbers.stream()
		.filter(number -> number%2 != 0)
		.forEach(System.out::println);
		
	}

}
