package day4;

import java.util.*;

public class kopi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("kopi ka teh?: ");
		String drink = sc.nextLine();

		System.out.print("gula nak?: ");
		String extra = sc.nextLine();

		double price = 0;

		if (drink.equals("kopi"))
			price = 1.00;
		else if (drink.equals("teh"))
			price = 0.60;
		if (extra.equals("nak"))
			price += 0.40;
		else if
		(extra.equals("tak"))
			price += 0.0;
		System.out.printf("Bayaq: RM %.2f" , price);

		sc.close();
	}
}
