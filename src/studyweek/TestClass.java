package studyweek;

public class TestClass {
	public static void main(String args[]) {
		int i = 0;
		loop: // 1
		{
			System.out.println("Loop Lable line");
			try {
				for (; true; i++) {
					System.out.println(i);
					if (i > 2/0)

						break loop; // 2
				}
			} catch (Exception e) {
				System.out.println("Exception in loop.");
			} finally {
				System.out.println("In Finally"); // 3
			}
		}
	}
}
