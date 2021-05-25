package chapter08.Homework04;

public class Teacher extends Employee{

    double mul;

    public Teacher(String name, double salary,double mul) {
        super(name, salary);
        this.mul=mul;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + this.getName() + '\'' +
                ", salary=" + this.getSalary() +
                '}';
    }

    @Override
    public void printMessage() {
        double sal = (this.getSalary()+mul)*365;
        System.out.println(toString() + "年薪：" + sal);
    }
}
