package day8;

class Bakal {
	String negeri;
	String kerja;
	int tinggi;
}

public class AwekClass {
	public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);

		Bakal bakal = new Bakal();

		bakal.negeri = "Kelantan";
		bakal.kerja = "kerja as Cikgu";
		bakal.tinggi = 152;

		System.out.println(String.format("Bakal dari %s %s dia tinggi %d je", bakal.negeri, bakal.kerja, bakal.tinggi));

//        scanner.close();
	}
}
