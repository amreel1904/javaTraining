package day4;

import java.util.Scanner;

public class greaterNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter five numbers:");
		int max = Integer.MIN_VALUE;

		for (int i = 0; i < 5; i++) {
			int number = scanner.nextInt();
			if (number > max) {
				max = number;
			}
		}

		System.out.println("The greater number is: " + max);

		scanner.close();
	}
}
