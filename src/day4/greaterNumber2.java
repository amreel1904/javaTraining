package day4;

import java.util.Scanner;

public class greaterNumber2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int x = scanner.nextInt();
		int y = scanner.nextInt();

		if (x > y)
			System.out.println("besar lagi " + x);
		else
			System.out.println("besar lagi " + y);

		scanner.close();
	}

}
