package day9;
import java.util.*;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Shuffle {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String values = sc.nextLine();
		List<String> list_Strings = Arrays.stream(values.split(" ")).collect(Collectors.toList());

		List<Integer>nums=new ArrayList<>();
	}
}
