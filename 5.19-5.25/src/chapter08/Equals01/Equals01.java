package chapter08.Equals01;

public class Equals01 {

    public static void main(String[] args) {

        Person ming = new Person("ming", 22, 'm');
        Person min = new Person("min", 22, 'm');

        System.out.println(ming.equals(min));
    }
}
