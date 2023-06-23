//Complete the code and give input and output example
//manipulates elements in a collection:

package day9;

import java.util.Scanner;
import java.util.Arrays;

public class ManipulateCollections {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a list of numbers separated by spaces: ");

		String numbersStr = sc.nextLine();

		int[] nums = Arrays.stream(numbersStr.split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
		System.out.println("The numbers in the array are: ");
		for (int num : nums) {
			System.out.println(num);

		}
		sc.close();
	}
}
