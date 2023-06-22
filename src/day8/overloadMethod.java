package day8;

public class overloadMethod {
	public static void main(String[] args) {
		print(5);
		print("asmaa");
		print("salary :RM ", 3589);
	}
	static void print(int number) {
		System.out.println(number);
	}

	static void print(String text) {
		System.out.println(text);
	}

	static void print(String text, int number) {
		System.out.println(text + ' ' + number);
	}
}
