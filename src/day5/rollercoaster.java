package day5;

import java.util.Scanner;

public class rollercoaster {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter place : ");
        int places = scanner.nextInt();

        System.out.print("Enter minAge : ");
        int minAge = scanner.nextInt();

        System.out.print("Enter queueSize : ");
        int queueSize = scanner.nextInt();

        int validPeopleCount = 0;
        for (int i = 0; i < queueSize; i++) {
            int personAge = scanner.nextInt();
            if (personAge >= minAge && places > validPeopleCount) {
                validPeopleCount++;
                System.out.println("The rollercoaster departures");
            } else {
                System.out.println("Not Eligible...");
            }
        }
        System.out.println("Places : " + places);
        System.out.println("Min Age : " + minAge);
        System.out.println("Queue Size : " + queueSize);
    }
}
