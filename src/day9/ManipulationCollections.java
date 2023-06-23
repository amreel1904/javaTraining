package day9;

import java.util.*;

public class ManipulationCollections {
	public static void main(String[] args) {
		String[] words = { "abc", "def", "geh", "yyy" };
		words = Arrays.stream(words).map(w -> w + "yyy").toArray(String[]::new);
		for(String word:words) {
		System.out.println(word);}
	}
}
