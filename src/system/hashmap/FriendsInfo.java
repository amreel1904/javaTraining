package system.hashmap;

import java.util.HashMap;
import java.util.Scanner;

public class FriendsInfo {

	static class Friend {
		private String name;
		private int age;
		private String state;
		private String work;
		private String status;

		public Friend(String name, int age, String state, String work, String status) {
			this.name = name;
			this.age = age;
			this.state = state;
			this.work = work;
			this.status = status;
		}

		public String getName() {
			return name;
		}

		public int getAge() {
			return age;
		}

		public String getState() {
			return state;
		}

		public String getWork() {
			return work;
		}

		public String getStatus() {
			return status;
		}
	}

	public static void main(String[] args) {
		HashMap<String, Friend> friendsMap = new HashMap<>();
		Scanner scanner = new Scanner(System.in);

		// Input phase
		System.out.println("Enter friend details (name, age, state, work, status). Enter 'done' to finish.");

		while (true) {
			System.out.print("Friend details: ");
			String input = scanner.nextLine();

			if (input.equalsIgnoreCase("done")) {
				break;
			}

			String[] parts = input.split(", ");
			if (parts.length != 5) {
				System.out.println("Invalid input. Please try again.");
				continue;
			}

			String name = parts[0];
			int age = Integer.parseInt(parts[1]);
			String state = parts[2];
			String work = parts[3];
			String status = parts[4];

			Friend friend = new Friend(name, age, state, work, status);
			friendsMap.put(name, friend);
		}

		// Output phase
		System.out.println("\nEnter a friend's name to get their details (enter 'done' to exit).");

		while (true) {
			System.out.print("Friend's name: ");
			String name = scanner.nextLine();

			if (name.equalsIgnoreCase("done")) {
				break;
			}

			Friend friend = friendsMap.get(name);
			if (friend == null) {
				System.out.println("Friend not found.");
			} else {
				System.out.println("Details of " + name + ":");
				System.out.println("Age: " + friend.getAge());
				System.out.println("State: " + friend.getState());
				System.out.println("Work: " + friend.getWork());
				System.out.println("Status: " + friend.getStatus());
			}
		}

		System.out.println("Exiting the program.");
	}

}

//_______OUTPUT_______//
//Enter friend details (name, age, state, work, status). Enter 'done' to finish.
//Friend details: John Doe, 30, California, Engineer, Single
//Friend details: Jane Smith, 25, New York, Teacher, Married
//Friend details: Mark Johnson, 35, Texas, Lawyer, Divorced
//Friend details: done
//
//Enter a friend's name to get their details (enter 'done' to exit).
//Friend's name: Jane Smith
//Details of Jane Smith:
//Age: 25
//State: New York
//Work: Teacher
//Status: Married
//Friend's name: Mark Johnson
//Details of Mark Johnson:
//Age: 35
//State: Texas
//Work: Lawyer
//Status: Divorced
//Friend's name: Mary Davis
//Friend not found.
//Friend's name: done
//Exiting the program.
