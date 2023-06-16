package day4;

import java.util.Scanner;

public class evenOdd {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);
		
		int integer = scanner.nextInt();
		
		if (integer%2 ==0)
			System.out.println("even");
		else
			System.out.println("odd");
		
		scanner.close();
			
	}

}
