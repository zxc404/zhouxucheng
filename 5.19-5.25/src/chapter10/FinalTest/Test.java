package chapter10.FinalTest;

public class Test {

    public static void main(String[] args) {

        System.out.println(new Circle(2).getS());
    }
}

class Circle{
    private double r;
    private final double PI;
    {
        PI = 3.14;
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getS(){
        return r*r*PI;
    }
}
