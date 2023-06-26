package day10;

import java.util.Random;

public class random {
	public static void main(String[] args) {

		Random randGen = new Random();
		System.out.println("Random[5...10]: " + (randGen.nextInt(6) + 6));
		System.out.println("Random[50...100]: " + randGen.nextInt(50, 101));

	}
}