/*Read an array of int, reverse ur and print its elements in a single line, space-separated */

package day6Array;

import java.util.*;

public class reverseArray {
    public static void main(String[] args) {
        Scanner syg = new Scanner(System.in);
        int n = Integer.parseInt(syg.nextLine());
        int[] arr = new int[n];

        // Reverse the array

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(syg.nextLine());

        }

        // Print the reversed array
        for (int i = n = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
