/*Write a program that sums all numbers in a list in the following order*/

package day7.method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class gaussTrick {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers separated by spaces:");
		String input = sc.nextLine();

		List<Integer> numbers = new ArrayList<>();
		for (String value : input.split(" ")) {
			numbers.add(Integer.parseInt(value));
		}

		int first = numbers.get(0);
		int last = numbers.get(numbers.size() - 1);
		int n = (numbers.size() - 1) / 2;

		List<Integer> sums = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			sums.add(numbers.get(i) + numbers.get(numbers.size() - 1 - i));
		}
		if (numbers.size() % 2 == 1) {
			sums.add(numbers.get(n));
		}

		System.out.println("Sum Pattern:");
		for (Integer sum : sums) {
			System.out.print(sum + " ");
		}

		sc.close();
	}
}
