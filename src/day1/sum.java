package day1;

import java.util.*;
import java.math.*;

public class sum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = Integer.parseInt(scanner.nextLine());
		BigDecimal sum = new BigDecimal(0);

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " n: ");
			BigDecimal num = new BigDecimal(scanner.nextLine());
			sum = sum.add(num);
		}
		System.out.print("Total : " + sum);
		scanner.close();

	}
}
