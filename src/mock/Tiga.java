package mock;

public class Tiga {
	public static void main(String[] args) {

//		String a = "aAaA", b = "bbBB";
//		if (a.length() == b.replace('x', 'y')
//				.length())
//			System.out.println("YES");
		
		String a, b, c;
		a = new String("hello");
		b = a;
		c = a + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}