package chapter08.Homework03;

public class Employee {

    private String name;
    private double sal;
    private int workDay;
    private double mul;

    public Employee(String name, double sal, int workDay) {
        this.name = name;
        this.sal = sal;
        this.workDay = workDay;
    }

    public void printsalary(){
        System.out.println(sal*workDay*mul);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", workDay=" + workDay +
                ", mul=" + mul +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public double getMul() {
        return mul;
    }

    public void setMul(double mul) {
        this.mul = mul;
    }
}
