package chapter08.Homework03;

public class Manager extends Employee{

    public Manager(String name, double sal, int workDay) {
        super(name, sal, workDay);
        this.setMul(1.2);
    }


    @Override
    public void printsalary() {
        System.out.println( this.toString());
        System.out.println(1000+this.getSal()*this.getWorkDay()
                *this.getMul());
    }
}
