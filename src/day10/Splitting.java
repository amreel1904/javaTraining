package day10;

import java.util.Arrays;

public class Splitting {

	public static void main(String[] args) {
		String text = "Hi gewe, saya Ehem Ehem.";
		String[] words = text.split("[, .]+");
		System.out.println(Arrays.toString(words));
	}
}
