package day1;

public class time {
	/*public static void main(String[] args) {
		byte centuries = 11;
		short year = (short) (centuries * 100);
		int days = (int) (year * 366);

		System.out.printf("%d centuries = %d years = %d days", centuries, year,
				days); 
	}*/
	/*public static void main(String[] args) {
		byte counter=0;
		for (int i=0; i<257; i++) {
			counter++;
			System.out.println(counter);
		}
	}*/
	
	public static void main(String[] args) {
		int hexa = 0xFFFFFF;
		long number = 1L;

		System.out.print(Integer.toHexString(hexa) + ", " + number);
	}
}
