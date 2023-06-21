package day7.method;

import java.util.Scanner;

public class rectangleArea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double w = Double.parseDouble(sc.nextLine());
		double h = Double.parseDouble(sc.nextLine());
		double area = totalArea(w, h);
		System.out.printf("%.0f%n", area);
		
		
	}

	public static double totalArea(double h, double w) {
		return w * h;
	}

}
