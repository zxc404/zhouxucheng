package chapter10.homework05;

/**
 * @author Zxc
 * @version 1.0
 */
public class Factory {

    public Horse getHorse(){
        return new Horse();
    }

    public Boat getBoat(){
        return new Boat();
    }
}
