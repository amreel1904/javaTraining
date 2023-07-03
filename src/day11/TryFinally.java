package day11;

import java.util.Scanner;

public class TryFinally {

	static void tryFinallyExample() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Code executed before try-finally.");
		try {
			String str = scanner.nextLine();
			Integer parsedInteger = Integer.parseInt(str);
			System.out.println("Parsing was successful.");
			return; // Exit from the current method -> executes the "finally" block
		} catch (NumberFormatException ex) {
			System.out.println("Parsing failed!");
		} finally {
			System.out.println("This cleanup code is always executed.");
			System.out.println("This code is after the try-finally block.");
		}
	}

	public static void main(String[] args) {
		tryFinallyExample();
	}
}
