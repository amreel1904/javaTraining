package day11;

import java.util.Arrays;

public class methodsArray {
	public static void main(String[] args) {
		Integer[] arr1 = { 10, 30, 20 };
		Arrays.sort(arr1, (x, y) -> y.compareTo(x));
		//Arrays.sort(arr,Comparator.reverseOrder());
		System.out.println(Arrays.toString(arr1)); // [30, 20, 10]

		int[] arr2 = { 10, 20, 30 };
		System.out.println(Arrays.equals(arr2, new int[] { 10, 20, 30 })); // true
	}
}
