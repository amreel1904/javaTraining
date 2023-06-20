package day6;

public class nestedWhile {
    public static void main(String[] args) {
        int row = 1;
        while (row <= 2) {
            System.out.printf("Row: %d%n", row);
            int col = 1;
            while (col <= 3) {
                System.out.printf("Column: %d%n", col);
                col++;
            }
            row++;
        }
    }

}
