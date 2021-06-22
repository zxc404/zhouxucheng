package chapter13.Big_;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {

        BigInteger bigInteger = new BigInteger("123232351234123442132312323");
        BigInteger bigInteger2 = new BigInteger("123232351234123442132312323");
        BigInteger bigInteger1 = bigInteger.add(bigInteger2) ;
        System.out.println(bigInteger1);

        BigDecimal bigDecimal = new BigDecimal("123.32312312312716847125476");
        BigDecimal bigDecima2 = new BigDecimal("67.323112716847125476");
        BigDecimal bigDecima3 = bigDecimal.subtract(bigDecima2);
        System.out.println(bigDecima3);
        BigDecimal bigDecima4 = bigDecimal.divide(bigDecima3,BigDecimal.ROUND_CEILING);
        System.out.println(bigDecima4);
    }
}
