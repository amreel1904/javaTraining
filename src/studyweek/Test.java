package studyweek;

public class Test {
	public static void main(String args[]) {
		int var = 20, i = 0;
		do {
			while (true) {
				if (i++ > var)

					break;
				System.out.println("i= " + i);
			}
			System.out.println();
			System.out.println("var "+var);
			
			System.out.println("i:  "+i);
		} while (i < var--);

		System.out.println("var is "+var);
	}
}
