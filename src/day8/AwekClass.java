package day8;

import java.util.Scanner;

class Awek {
	String negeri;
	String kerja;
	int tinggi;
}

//public class AwekClass {
//	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

//		Bakal bakal = new Bakal();
//
//		bakal.negeri = "Kelantan";
//		bakal.kerja = "kerja as Cikgu";
//		bakal.tinggi = 152;
//
//		System.out.println(String.format("Bakal dari %s %s dia tinggi %d je", bakal.negeri, bakal.kerja, bakal.tinggi));

//        scanner.close();
//---------------------------------------------/Input output/------------------------------------------------------\\



public class AwekClass {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Awek awek = new Awek();

		System.out.print("Masukkan negeri: ");
		awek.negeri = scanner.nextLine();

		System.out.print("Masukkan kerja: ");
		awek.kerja = scanner.nextLine();

		System.out.print("Masukkan tinggi: ");
		awek.tinggi = scanner.nextInt();

		System.out.println(String.format("Awek dari %s %s - %d tinggi", awek.negeri, awek.kerja, awek.tinggi));

		scanner.close();
	}

}
