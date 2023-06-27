package day11;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public class RandomizeNumber {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(21);
		numbers.add(12);
		numbers.add(41);
		numbers.add(7);

		System.out.println("Before randomization: " + numbers);

		RandomizeNumber.randomizeList(numbers);

		System.out.println("After randomization: " + numbers);

	}

	public static <T> void randomizeList(List<T> list) {

		Random randGen = new Random();

		for (int i = 0; i < list.size(); i++) {
			int randIndex = randGen.nextInt(list.size());
			// Swap list[i] with list[randIndex]
			T oldValue = list.get(i);
			list.set(i, list.get(randIndex));
			list.set(randIndex, oldValue);

		}
	}

}
