package chapter17.objectoutputstream;

import java.io.*;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) throws IOException {

        String filePath = "E:\\repository\\java_learning\\7.21-7.27\\src\\chapter17\\objectoutputstream\\data.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeInt(100);
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(9.5);
        objectOutputStream.writeUTF("可以的");
        objectOutputStream.writeObject(new Dog("旺财",12));
        objectOutputStream.close();
    }
}
class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
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
