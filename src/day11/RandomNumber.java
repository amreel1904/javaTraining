package day11;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Random randGen = new Random();

		int start = scan.nextInt();

		int end = scan.nextInt();

		int randomNum = randGen.nextInt(end - start + 1) + start;
		// int randomNum = randGen.nextInt(start, end+1) ;
		System.out.println(randomNum);

	}
}
