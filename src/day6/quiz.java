package day6;

public class quiz {
    public static void main(String args[]) {
        // int c = 0;
        // boolean flag = true;
        // for (int i = 0; i < 3; i++) {
        // while (flag) {
        // c++;
        // if (i > c || c > 5)
        // flag = false;
        // }
        // }
        // System.out.println(c);

        // int[] arr = { 1, 2, 3, 4, 5, 6 };
        // int counter = 0;
        // for (int value : arr) {
        // if (counter >= 5) {
        // break;
        // } else {
        // continue;
        // }
        // if (value > 4) {
        // arr[counter] = value + 1;
        // }
        // counter++;
        // }
        // System.out.println(arr[counter]);

        // int a = 5, b = 2, c = 30;
        // System.out.println(a + ++b * c);

        int k = 9, s = 5;
        switch (k) {
            default:
                if (k == 10) {
                    s = s * 2;
                } else {
                    s = s + 4;
                    break;
                }
            case 7:
                s = s + 3;
        }
        System.out.println(s);
    }

}
