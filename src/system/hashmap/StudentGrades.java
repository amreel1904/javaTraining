package system.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
	public static void main(String[] args) {
		HashMap<String, Integer> gradesMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		// Input phase
		System.out.println("Enter student names and their grades (separated by a space). Enter 'done' to finish.");

		while (true) {
			System.out.print("Student name and grade: ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("done")) {
				break;
			}

			String[] parts = input.split(" ");
			if (parts.length != 2) {
				System.out.println("Invalid input. Please try again.");
				continue;
			}

			String studentName = parts[0];
			int grade;
			try {
				grade = Integer.parseInt(parts[1]);
			} catch (NumberFormatException e) {
				System.out.println("Invalid grade. Please try again.");
				continue;
			}

			gradesMap.put(studentName, grade);
		}

		// Output phase
		System.out.println("\nEnter a student name to get their grade (enter 'done' to exit).");

		while (true) {
			System.out.print("Student name: ");
			String studentName = scanner.nextLine();

			if (studentName.equalsIgnoreCase("done")) {
				break;
			}

			Integer grade = gradesMap.get(studentName);
			if (grade == null) {
				System.out.println("Student not found.");
			} else {
				System.out.println("Grade for " + studentName + ": " + grade);
			}
		}

		System.out.println("Exiting the program.");
		scanner.close();
	}
}

//____________OUTPUT_________//

//Enter employee names and their salaries (separated by a space). Enter 'done' to finish.
//Employee name and salary: John 50000
//Employee name and salary: Alice 65000
//Employee name and salary: Bob 55000
//Employee name and salary: done
//
//Enter an employee name to get their salary (enter 'done' to exit).
//Employee name: Alice
//Salary for Alice: $65000.0
//Employee name: Bob
//Salary for Bob: $55000.0
//Employee name: David
//Employee not found.
//Employee name: done
//Exiting the program.
