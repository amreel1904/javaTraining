package day10;
import java.util.Scanner;
import java.util.Random;

public class randomNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randGen = new Random();
        int start = scan.nextInt();
        int end = scan.nextInt();

        // The `nextInt(end-start+1) + start` expression generates a random number in the range [start, end].
        // However, the `nextInt(start, end+1)` expression generates a random number in the range [start, end).
        // So, we need to change the `nextInt(end-start+1) + start` expression to `nextInt(start, end+1)`.
        int randomNum = randGen.nextInt(start, end + 1);

        System.out.println(randomNum);
    }
}
