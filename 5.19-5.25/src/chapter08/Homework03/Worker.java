package chapter08.Homework03;

public class Worker extends Employee{

    public Worker(String name, double sal, int workDay) {
        super(name, sal, workDay);
        this.setMul(1.0);
    }
    @Override
    public void printsalary() {
        System.out.println( this.toString());
        System.out.println( this.getSal()*this.getWorkDay()
                *this.getMul());
    }
}
