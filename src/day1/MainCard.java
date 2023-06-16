package day1;

public class MainCard {
	public static void main(String[] args) {
		Card aceClubs = new Card("A", '♣');
		System.out.println(aceClubs);
		Card tenDiamond = new Card("K", '♦');
		System.out.println(tenDiamond);
		Card oneDot = new Card("1", '.');
		System.out.println(oneDot); // Exception
	}
}
