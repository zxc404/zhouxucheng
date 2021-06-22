package chapter14.linkedlist;

import java.util.LinkedList;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestLinkedList {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        for (int i = 0; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);
        list.remove();
        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(2));
        for (Object o :list) {
            System.out.print(o +", ");
        }
        System.out.println();
        System.out.println(list.size());

    }
}
