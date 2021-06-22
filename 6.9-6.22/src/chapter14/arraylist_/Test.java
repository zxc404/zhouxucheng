package chapter14.arraylist_;

import java.util.ArrayList;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        list.add("next");
    }
}
