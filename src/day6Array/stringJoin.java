package day6Array;

public class stringJoin {
    public static void main(String[] args) {
        String [] strings = {"\nsatu","dua\n"};

        System.out.println(String.join(" ",strings));//satu dua
        // int[]arr={1,2,3};
        // System.out.println(String.join(" ", arr)); // compile error
    }
}

