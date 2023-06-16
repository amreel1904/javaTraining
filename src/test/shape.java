package test;

public class shape {
	public static void main(String[] args) {
		atas();
		bawah();
		System.out.println();
		atas();
		tengah();
		bawah();
		System.out.println();
		atas();
		lineplus();
		System.out.println();
		atas();
	}

	public static void atas() {
		System.out.println("   ______  ");
		System.out.println("  /      \\ ");
		System.out.println(" /        \\");
	}

	public static void bawah() {
		System.out.println(" \\        /");
		System.out.println("  \\______/");
	}

	public static void tengah() {
		System.out.println("|          |");
		System.out.println("|          |");
		System.out.println("|          |");
	}

	public static void lineplus() {
		System.out.println(" +--------+");
	}
}
