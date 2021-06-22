package chapter13.System_;

import java.util.Arrays;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        System.out.println("1");
//        System.exit(0);
//        System.out.println("2");
        int[] a = {1,2,3};
        int[] b = new int[3];
        System.arraycopy(a,0,b,1,b.length-1);
        System.out.println(Arrays.toString(b));
        System.out.println(System.currentTimeMillis());
    }
}
