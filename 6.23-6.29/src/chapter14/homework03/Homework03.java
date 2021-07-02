package chapter14.homework03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework03 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("smith",2900);
        hashMap.put("jack",2600);
        Set set = hashMap.keySet();
        for (Object o :set) {
            System.out.println(o+":"+hashMap.get(o));
            hashMap.put(o,((int)hashMap.get(o)+100));
            System.out.println(o+":"+hashMap.get(o));
        }
        System.out.println("===============");
        Set set1 = hashMap.entrySet();
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
