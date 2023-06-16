package test;

import java.math.*;

public class hello {
	public static void main(String[] args) {
	/*	printCheer();
	}
	public static void printCheer() {
		System.out.println("Three cheers for Pirates!");
		System.out.println("Huzzah!");
		System.out.println("Huzzah!");
		System.out.println("Huzzah!");
*/
		/* System.out.println(11/4.0000);
		System.out.println(11/0.0);
		System.out.println(8 % 2.5);   */	
		
		BigDecimal number = new BigDecimal(0);
		number = number.add(BigDecimal.valueOf(2.5));
		number = number.subtract(BigDecimal.valueOf(1.5));
		number = number.multiply(BigDecimal.valueOf(2));
		number = number.divide(BigDecimal.valueOf(2));
			
		System.out.print(number);
	}
}

