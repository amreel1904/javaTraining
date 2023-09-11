package studyweek;

public class equalequal {
	public static void main(String[] args) {
		String s1 = "java";
		String s2 = "java";
		String s3 = new String("java");
		System.out.println(s1 == s2); // 1
		// System.out.println(s1 == s3); // 2
		System.out.println(s1.equals(s2));// 3
		System.out.println(s2.equals(s3)); // 4
		System.out.println("s1 s3 :" + s1.equals(s3)); // 5

	}
}
