package chapter14;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Zxc
 * @version 1.0
 */
public class Treeset_ {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o1).compareTo(((String) o2));
            }
        });
        treeSet.add("djd");
        treeSet.add("sda");
        treeSet.add("rwr");
        treeSet.add("gtb");
        System.out.println(treeSet);
    }
}
