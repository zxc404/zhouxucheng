package chapter17.homework03;

import java.io.*;
import java.util.Properties;

/**
 * @author Zxc
 * @version 1.0
 */
public class Homewok03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Properties properties = new Properties();
        properties.load(new FileReader("E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\homework03\\dog.properties"));
        System.out.println(new Dog(properties.getProperty("name"),Integer.parseInt(properties.getProperty("age")),properties.getProperty("color")));
        ObjectOutputStream ous = new ObjectOutputStream(new FileOutputStream("E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\homework03\\dog.dat"));
        ous.writeObject(new Dog(properties.getProperty("name"),Integer.parseInt(properties.getProperty("age")),properties.getProperty("color")));
        ous.close();
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\homework03\\dog.dat"));
        System.out.println(objectInputStream.readObject());
    }
}
class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
