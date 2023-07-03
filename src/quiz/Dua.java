package quiz;

//import java.util.List;
//import java.util.ArrayList;

public class Dua {
	public static void main(String[] args) {
	
		{ ifTest(true);
	        ifTest(false);}

	}

//		List s1 = new ArrayList();
//		s1.add("a");
//		s1.add("b");
//		s1.add("c");
//		s1.add("a");
//		System.out.println(s1.remove("a") + " " + s1.remove("x"));

//-------------------------------------------------//

//
//		int i = 0, j = 0;
//		X1: for (i = 0; i < 3; i++) {
//			X2: for (j = 3; j > 0; j--) {
//				if (i < j)
//					continue X1;
//				else
//					break X2;
//			}
//		}
//		System.out.println(i + " " + j);

//-------------------------------------------------//
		public static void ifTest(boolean flag) {
		if (flag) // 1
			if (flag) // 2
				if (flag) // 3
					System.out.println("False True");
				else // 4
					System.out.println("True False");
			else // 5
				System.out.println("True True");
		else // 6
			System.out.println("False False");

	}
}
