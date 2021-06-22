package chapter14.Map_;

import java.util.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class TestMap {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("no1","susan");
        map.put("no2","su");
        map.put("no1","san");
        map.put("no3","susan");
        System.out.println(map);
        System.out.println(map.get("no3"));
        map.put(new Car("volvo",300000),"made in China");
        map.put(new Car("volvo",300000),"made in German");
        System.out.println(map);
        System.out.println("=========================");

//        遍历方法
        Set set = map.keySet();
        for (Object o :set) {
            System.out.println(o + "-" + map.get(o));
        }

        System.out.println("-----------------------");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            System.out.println(obj + "-" + map.get(obj));
        }

        System.out.println("-----------------------");
        Collection values = map.values();
        for (Object o :values) {
            System.out.println(o);
        }

        System.out.println("-----------------------");
        Set set1 = map.entrySet();
        for (Object o : set1) {
            Map.Entry en = (Map.Entry) o;
            System.out.println(en.getKey() + "-" +en.getValue());
        }


    }
}

class Car{
    private String name;
    private double price;

    public Car(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
