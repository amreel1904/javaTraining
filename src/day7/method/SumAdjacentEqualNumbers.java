package day7.method;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal numbers separated by spaces:");
		List<Double> numbers = Arrays.stream(sc.nextLine().split(" "))
				.map(Double::parseDouble).collect(Collectors.toList());

		for (int i = 0; i < numbers.size() - 1; i++) {
			if (numbers.get(i).equals(numbers.get(i + 1))) {
				numbers.set(i, numbers.get(i) + numbers.get(i + 1));
				numbers.remove(i + 1);
				i = -1; // Reset the index to check from the beginning
			}
		}
		String output = joinElementsByDelimiter(numbers, " ");
		System.out.println(output);

		for (Double value : numbers) {
			System.out.print(value + " ");
		}

		sc.close();
	}

	static String joinElementsByDelimiter(List<Double> items,String delimiter) {
		String output = "";
		for (Double item : items) {
			output += (new DecimalFormat("0.#").format(item) + delimiter);
		}
		return output;
	}
}
