package day11;

import java.util.*;

public class TryCatch {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		try {
			Integer.parseInt(s);
			System.out.printf("You entered a valid integer number: %s", s);
		} catch (NumberFormatException ex) {
			System.out.println("Invalid integer number!");

		}
	}
}