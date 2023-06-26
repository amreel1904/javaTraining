package day10;

import java.util.*;

public class textFilter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] banWs = sc.nextLine().split(", ");
		String text = sc.nextLine();

		for (String banW : banWs) {
			if (text.contains(banW)) {
				String replacement = repeatStr("*", banW.length());
				text = text.replace(banW, replacement);

			}
		}
		System.out.println(text);

	}

	private static String repeatStr(String str, int length) {
		String result = "";
		for (int i = 0; i < length; i++) {
			result += str;
		}
		return result;

	}

}
