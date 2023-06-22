package system;

import java.util.Scanner;

public class AwekInfoV2 {
	private String negeri;
	private String kerja;
	private int umur;
	private String hobby;
	private String relationshipStatus;
	private String phoneNumber;
	private String address;
	private String email;
	private String favoriteFood;
	private String favoriteColor;

	public String getNegeri() {
		return negeri;
	}

	public void setNegeri(String negeri) {
		this.negeri = negeri;
	}

	public String getKerja() {
		return kerja;
	}

	public void setKerja(String kerja) {
		this.kerja = kerja;
	}

	public int getUmur() {
		return umur;
	}

	public void setUmur(int umur) {
		this.umur = umur;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	public String getRelationshipStatus() {
		return relationshipStatus;
	}

	public void setRelationshipStatus(String relationshipStatus) {
		this.relationshipStatus = relationshipStatus;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFavoriteFood() {
		return favoriteFood;
	}

	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}

	public String getFavoriteColor() {
		return favoriteColor;
	}

	public void setFavoriteColor(String favoriteColor) {
		this.favoriteColor = favoriteColor;
	}

	public String toString() {
		return String.format(
				"Negeri: %s\nKerja: %s\nUmur: %d\nHobby: %s\nRelationship Status: %s\nPhone Number: %s\nAddress: %s\nEmail: %s\nFavorite Food: %s\nFavorite Color: %s",
				negeri, kerja, umur, hobby, relationshipStatus, phoneNumber, address, email, favoriteFood,
				favoriteColor);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		AwekInfoV2 awek = new AwekInfoV2();

		System.out.print("Enter negeri: ");
		String negeri = scanner.nextLine();
		awek.setNegeri(negeri);

		System.out.print("Enter kerja: ");
		String kerja = scanner.nextLine();
		awek.setKerja(kerja);

		System.out.print("Enter umur: ");
		int umur = scanner.nextInt();
		awek.setUmur(umur);
		scanner.nextLine();

		System.out.print("Enter hobby: ");
		String hobby = scanner.nextLine();
		awek.setHobby(hobby);

		System.out.print("Enter relationship status: ");
		String relationshipStatus = scanner.nextLine();
		awek.setRelationshipStatus(relationshipStatus);

		System.out.print("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		awek.setPhoneNumber(phoneNumber);

		System.out.print("Enter address: ");
		String address = scanner.nextLine();
		awek.setAddress(address);

		System.out.print("Enter email: ");
		String email = scanner.nextLine();
		awek.setEmail(email);

		System.out.print("Enter favorite food: ");
		String favoriteFood = scanner.nextLine();
		awek.setFavoriteFood(favoriteFood);

		System.out.print("Enter favorite color: ");
		String favoriteColor = scanner.nextLine();
		awek.setFavoriteColor(favoriteColor);

		System.out.println(awek.toString());

		scanner.close();
	}
}
