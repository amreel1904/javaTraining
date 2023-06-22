package day8;

public class valueTypes {
	public static void main(String[] args) {
		int[] num = { 265 }; // Initialize the array with a single element
		increment(num, 1500);
		System.out.println(num[0]);
	}

	public static void increment(int[] num, int value) { // Accept an array as a parameter
		num[0] += value; // Increment the value at index 0 of the array
		System.out.println(num[0]);
	}
}
