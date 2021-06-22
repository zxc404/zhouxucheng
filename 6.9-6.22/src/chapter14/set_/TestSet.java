package chapter14.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestSet {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Set set = new HashSet();
        for (int i = 0; i < 8; i++) {
            set.add(i);
        }
        System.out.println(set);
        for (Object o :set) {
            System.out.print(o + " ");
        }
        System.out.println();


    }
}
