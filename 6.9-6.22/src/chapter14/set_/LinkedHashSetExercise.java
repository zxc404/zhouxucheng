package chapter14.set_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * @author Zxc
 * @version 1.0
 */
public class LinkedHashSetExercise {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        HashSet set = new LinkedHashSet();
        set.add(new Car("Audi",423000));
        set.add(new Car("Benz",473000));
        set.add(new Car("BMW",403000));
        set.add(new Car("Passat",223000));
        set.add(new Car("Nissan",173000));
        set.add(new Car("Porsche",883000));
        set.add(new Car("Porsche",883000));
        for (Object o :set) {
            System.out.println(o);
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
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 &&
                name.equals(car.name);
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
