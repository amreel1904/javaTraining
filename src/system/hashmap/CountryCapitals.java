package system.hashmap;
import java.util.HashMap;
import java.util.Scanner;

public class CountryCapitals {
    public static void main(String[] args) {
        HashMap<String, String> capitalsMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        // Input phase
        System.out.println("Enter country names and their capitals (separated by a space). Enter 'done' to finish.");

        while (true) {
            System.out.print("Country name and capital: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("done")) {
                break;
            }

            String[] parts = input.split(" ");
            if (parts.length != 2) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            String country = parts[0];
            String capital = parts[1];

            capitalsMap.put(country, capital);
        }

        // Output phase
        System.out.println("\nEnter a country name to get its capital (enter 'done' to exit).");

        while (true) {
            System.out.print("Country name: ");
            String country = scanner.nextLine();

            if (country.equalsIgnoreCase("done")) {
                break;
            }

            String capital = capitalsMap.get(country);
            if (capital == null) {
                System.out.println("Capital not found.");
            } else {
                System.out.println("Capital of " + country + ": " + capital);
            }
        }

        System.out.println("Exiting the program.");
    }
}
//_______OUTPUT_______//

//Enter country names and their capitals (separated by a space). Enter 'done' to finish.
//Country name and capital: United States Washington D.C.
//Country name and capital: United Kingdom London
//Country name and capital: France Paris
//Country name and capital: done
//
//Enter a country name to get its capital (enter 'done' to exit).
//Country name: United Kingdom
//Capital of United Kingdom: London
//Country name: France
//Capital of France: Paris
//Country name: Germany
//Capital not found.
//Country name: done
//Exiting the program.

