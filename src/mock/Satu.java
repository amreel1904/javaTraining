package mock;

public class Satu {
	public static void main(String args[]) {
		int x = Integer.parseInt(args[0]);
		switch (x) {
		case x < 5:
			System.out.println("BIG");
			break;
		case x > 5:
			System.out.println("SMALL");
		default:
			System.out.println("CORRECT");
			break;
		}
	}

}
