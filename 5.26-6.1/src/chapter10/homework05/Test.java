package chapter10.homework05;

import java.util.Scanner;

/**
 * @author Zxc
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Vehicles vehicle = new Horse();
        Person person = new Person("玄奘", vehicle);
        System.out.print("input:");
        if(new Scanner(System.in).next().equalsIgnoreCase("river")){
            person.setVehicle(new Boat());
        }
        person.getVehicle().work();
    }
}
