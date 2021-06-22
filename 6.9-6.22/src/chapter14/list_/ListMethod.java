package chapter14.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class ListMethod {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("uhsu");
        list.add(12123);
        list.add('s');
        list.add(true);
        list.add(new Scanner(System.in));
        list.remove(4);

        for (Object o :list) {
            System.out.println(o);
        }
        List sub = list.subList(1,3);
        for (Object o :sub) {
            System.out.println(o);
        }

        sub.set(1,false);
        sub.add("t");

        System.out.println("============");

        for (Object o :list) {
            System.out.println(o);
        }

        System.out.println("============");
        for (Object o :sub) {
            System.out.println(o);
        }
        System.out.println("============");

        list.addAll(sub);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj);
        }


    }
}
