package chapter14.collection_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("jack");
        list.add(13213);
        list.add('w');
        list.add(true);

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj.toString());
        }

        for (Object o : list) {
            System.out.println(o.toString());
        }

        int s = (int) list.get(1);
        System.out.println(s);
        System.out.println(list.isEmpty());
        list.clear();
        System.out.println(list.isEmpty());
    }
}
