package chapter15;

import java.util.ArrayList;

/**
 * @author Zxc
 * @version 1.0
 */
public class Generic01 {

    @SuppressWarnings({"all"})
    public static void main(String[] args) {

        ArrayList<Dog> arrayList = new ArrayList<Dog>();

        arrayList.add(new Dog("旺财",6));
        arrayList.add(new Dog("福贵",12));
        arrayList.add(new Dog("大黄",7));

//        arrayList.add(new Cat("咪咪",7));

        for (Dog o :arrayList) {
            System.out.println(o);
        }

    }
}

class Dog{

    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Cat{
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
