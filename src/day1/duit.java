package day1;

import java.util.Scanner;

public class duit {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the British pounds: ");
		double num = Double.parseDouble(scanner.nextLine());

		double result = num * 1.31;

		System.out.printf("US dollar: %.3f%n", result);
		scanner.close();
	}
}
