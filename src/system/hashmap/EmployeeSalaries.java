package system.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class EmployeeSalaries {
	public static void main(String[] args) {
		HashMap<String, Double> salariesMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		// Input phase
		System.out.println("Enter employee names and their salaries (separated by a space). Enter 'done' to finish.");

		while (true) {
			System.out.print("Employee name and salary: ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("done")) {
				break;
			}

			String[] parts = input.split(" ");
			if (parts.length != 2) {
				System.out.println("Invalid input. Please try again.");
				continue;
			}

			String employeeName = parts[0];
			double salary;
			try {
				salary = Double.parseDouble(parts[1]);
			} catch (NumberFormatException e) {
				System.out.println("Invalid salary. Please try again.");
				continue;
			}

			salariesMap.put(employeeName, salary);
		}

		// Output phase
		System.out.println("\nEnter an employee name to get their salary (enter 'done' to exit).");

		while (true) {
			System.out.print("Employee name: ");
			String employeeName = scanner.nextLine();

			if (employeeName.equalsIgnoreCase("done")) {
				break;
			}

			Double salary = salariesMap.get(employeeName);
			if (salary == null) {
				System.out.println("Employee not found.");
			} else {
				System.out.println("Salary for " + employeeName + ": $" + salary);
			}
		}

		System.out.println("Exiting the program.");
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
