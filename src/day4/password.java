package day4;

import java.util.Scanner;

public class password {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter Password: ");
		String x = scanner.nextLine();

		if (x.equals("jj10"))
			System.out.println("Welcome");
		else
			System.out.println("Belah ah kau");
		scanner.close();
	}
}
