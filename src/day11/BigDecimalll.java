package day11;

import java.math.*;
import java.util.*;

public class BigDecimalll {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		BigDecimal initialAmount = new BigDecimal(scanner.next());
		BigDecimal interestRate = new BigDecimal(scanner.next());

		BigDecimal hundred = new BigDecimal(100);

		BigDecimal total = initialAmount.add(initialAmount.multiply(interestRate.divide(hundred)));

		// total = initialAmount + (initialAmount * (interestRate / 100))

		System.out.println(total);
		scanner.close();
	}
	
}
