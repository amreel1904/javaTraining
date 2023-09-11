package studyweek;

import java.util.*;

public class ArrayListt {
	public static void main(String[] args) {
		List<String> items = new ArrayList<>();

		items.add(0, "pen");
		items.add(1, "pencil");
		items.add(2, "erasers");
		items.add("paper");
		for (String x : items) {
			System.out.print(x + " ");
		}

	}
}
