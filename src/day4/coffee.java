package day4;

import java.util.Scanner;

public class coffee {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("kopi ka teh?: ");
		String drink = sc.nextLine();

		if (drink.equals("kopi")) {
			System.out.print("gula nak?: ");
			String extra = sc.nextLine();

			if (extra.equals("nak")) {
				System.out.println("Harga: RM 1.40");
			} else {
				System.out.println("Harga: RM 1.00");
			}
		}

		else if (drink.equals("teh")) {
			System.out.print("gula nak?: ");
			String extra = sc.nextLine();

			if (extra.equals("nak")) {
				System.out.println("Harga: RM 1.00");
			} else {
				System.out.println("Harga: RM 0.60");
			}
		}

		else {
			System.out.println("Final price: RM 0.00");
		}

		sc.close();
	}
}
