package system;

import java.util.Scanner;

public class AttendanceManagementSystem {
	public static void main(String[] args) {
		
// Create a Scanner object to read user input		
		Scanner scanner = new Scanner(System.in);
		
// Get the student's name
		System.out.println("Enter the student's name:");
		String name = scanner.nextLine();
		
// Get the student's ID number
		System.out.println("Enter the student's ID number:");
		int id = scanner.nextInt();
		
// Get the student's attendance status
		System.out.println("Is the student attending class today? (Y/N)");
		char attendance = scanner.next().charAt(0);
		
// Print a message to the student
		if (attendance == 'Y') {
			System.out.println("Welcome to class, " + name + "!");
			System.out.println("Id: "+id);
		} else {
			System.out.println("Sorry to see you're absent, " + name + ".");
		}
		
// Close the Scanner object
		scanner.close();
	}
}