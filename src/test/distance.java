package test;

import java.util.*;

public class distance {
	public static void main(String[] args) {
		System.out.printf("Input meter= ");
		Scanner scanner = new Scanner(System.in);
		int meters = Integer.parseInt(scanner.nextLine());
		double kilometers = meters / 1000;
		System.out.printf("%.9f km", kilometers);
		scanner.close();
	}
}
