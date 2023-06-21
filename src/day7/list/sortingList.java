package day7.list;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class sortingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>(
				Arrays.asList("Amreel", "Nuqman", "Asmaa", "Teha"));
		Collections.sort(names);
		System.out.println(String.join(", ", names));
		Collections.sort(names);
		Collections.reverse(names);
		System.out.println(String.join(", ", names));
	}

}
