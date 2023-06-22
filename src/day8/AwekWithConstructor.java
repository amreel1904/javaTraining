package day8;

import java.util.Scanner;

public class AwekWithConstructor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String brand = sc.nextLine();
		String model = sc.nextLine();
		int hp = sc.nextInt();

		if (hp == 0) {
			Awek2 kereta = new Awek2(brand, model);
			System.out.println(kereta);
		} else {
			Awek2 kereta = new Awek2(brand, model, hp);
			System.out.println(kereta);
		}
	}
}

class Awek2 {
	private String brand;
	private String model;
	private int horsePower;

	public Awek2(String brand, String model) {
		this.brand = brand;
		this.model = model;
		this.horsePower = -1;
	}

	public Awek2(String brand, String model, int horsePower) {
		this(brand, model);
		this.horsePower = horsePower;
	}

	public String getBrand() {
		return this.brand;
	}

	public String getModel() {
		return this.model;
	}

	public int getHorsePower() {
		return this.horsePower;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setHorsePower(int hp) {
		this.horsePower = hp;
	}

	public String toString() {
		return String.format("%s - %s - %d tahun :)", this.brand, this.model, this.horsePower);
	}

}