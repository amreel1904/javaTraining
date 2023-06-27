package day11;

import java.math.BigDecimal;

public class BigDecimall {
    public static void main(String[] args) {
        var a = new BigDecimal("1.0000000000300000000005");
        var m = a.multiply(new BigDecimal("5.000000002"));
        System.out.println(m);

        // 5.00000000035000000000850000000010
    }
}
