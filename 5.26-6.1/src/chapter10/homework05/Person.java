package chapter10.homework05;

/**
 * @author Zxc
 * @version 1.0
 */
public class Person {

    private String name;
    private Vehicles vehicle;

    public Person(String name, Vehicles vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }

    public void setVehicle(Vehicles vehicle) {
        this.vehicle = vehicle;
    }

    public Vehicles getVehicle() {
        return vehicle;
    }
}
