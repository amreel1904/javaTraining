package day1;

import java.util.Scanner;

public class reversechar {
	public static void main(String []args) {
		Scanner scanner = new Scanner(System.in);
		
		char char1 = scanner.nextLine().charAt(0);
		char char2 = scanner.nextLine().charAt(0);
		char char3 = scanner.nextLine().charAt(0);
		
		System.out.printf("%c %c %c", char3, char2, char1);
		scanner.close();			
	}
}
