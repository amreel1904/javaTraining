package day10;

import java.util.Scanner;

public class RepeatString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String string = scanner.nextLine();

		String[] words = string.split(" ");
		String repeatedWords = "";
		for (String word : words) {
			int length = word.length();
			repeatedWords += word.repeat(length);
		}

		System.out.println("The repeated words are: " + repeatedWords);
	}
}
