package day11;

public class ThrowEx {
	public static double calcSqrt(double value) {
		if (value < 0)
			throw new ArithmeticException("Sqrt for negative numbers is undefined!");
		return Math.sqrt(value);

	}

	public static void main(String[] args)

	{
		try {
			calcSqrt(-1);
		}
		catch (ArithmeticException ex) {
			System.err.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
	}
}
