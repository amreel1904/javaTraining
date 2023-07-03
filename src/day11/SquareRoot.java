package day11;

import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		try {
			int num = Integer.parseInt(scanner.nextLine());
			double sqrt = calcSqrt(num);
			System.out.printf("%.2f\n", sqrt);
		} catch (Exception ex) {
			System.out.println("Invalid");
		} finally {
			System.out.println("Goodbye");
		}
		scanner.close();
	}

	private static double calcSqrt(int num) {
//		if (num < 0) {
//			throw new IllegalArgumentException("Invalid number");
//		}

		return Math.sqrt(num);
	}

}
