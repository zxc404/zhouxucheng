package chapter08.Homework04;

public class Worker extends Employee{
    public Worker(String name, double salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }

    @Override
    public void printMessage() {
        super.printMessage();
    }
}
