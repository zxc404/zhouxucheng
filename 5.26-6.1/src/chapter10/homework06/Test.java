package chapter10.homework06;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        Car car1 = new Car(35.5);
        car1.new Air().flow();
        Car car2 = new Car(-4);
        car2.new Air().flow();
        Car car3 = new Car(46.1);
        car3.new Air().flow();
    }
}
