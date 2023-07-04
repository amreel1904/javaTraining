//The code was using a switch statement with expressions 
//in the case labels, which is not allowed. 
//The case labels in a switch statement should be 
//constant expressions, not conditions.

package mock;

public class Satu {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        if (x < 5) {
            System.out.println("BIG");
        } else if (x > 5) {
            System.out.println("SMALL");
        } else {
            System.out.println("CORRECT");
        }
    }
}

