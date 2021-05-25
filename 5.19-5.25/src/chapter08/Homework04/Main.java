package chapter08.Homework04;

public class Main {

    public static void main(String[] args) {

        Worker jack = new Worker("Jack", 100);
        Teacher lee = new Teacher("Lee", 200, 56);
        jack.printMessage();
        lee.printMessage();
    }
}
