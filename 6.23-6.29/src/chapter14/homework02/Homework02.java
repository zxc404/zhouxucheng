package chapter14.homework02;

import java.util.ArrayList;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homework02 {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList arrayList = new ArrayList();
        Car car = new Car("宝马",400000);
        Car car1 = new Car("奔驰",1000000);
        arrayList.add(car);
        arrayList.add(new Car("宾利",2000000));
        for (Object o :arrayList) {
            System.out.println(o.toString());
        }
        arrayList.remove(1);
        for (Object o :arrayList) {
            System.out.println(o.toString());
        }
        System.out.println(arrayList.contains(car));
        System.out.println(arrayList.size());
        System.out.println(arrayList.isEmpty());
        arrayList.add(car);
        arrayList.add(car1);
        System.out.println(arrayList.containsAll(arrayList));
//        arrayList.clear();
//        arrayList.removeAll(arrayList);
    }
}
