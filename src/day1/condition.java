package day1;

import java.util.Scanner;

public class condition {
	public static void main(String[]args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Berapa lembap da? ");
		int humidity=scanner.nextInt();
		
		if (humidity >90) 
			System.out.println("Hujan takyah siram ler");
		
		else
			System.out.println("Kena siram");
	
		
		scanner.close();		
	}
}
