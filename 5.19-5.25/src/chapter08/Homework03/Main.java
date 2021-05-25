package chapter08.Homework03;

public class Main {

    public static void main(String[] args) {

        Manager jack = new Manager("Jack", 400, 30);
        Worker mike = new Worker("Mike", 100, 31);
        jack.printsalary();
        mike.printsalary();
    }
}
