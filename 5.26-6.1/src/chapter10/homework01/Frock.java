package chapter10.homework01;

/**
 * @author Zxc
 * @version 1.0
 */
public class Frock {

    private static int currentNum = 100000;
    private int serialNumber;

    public int getSerialNumber() {
        return serialNumber;
    }

    public Frock() {
        this.serialNumber = getNextNum();
    }

    public static int getNextNum(){
        currentNum += 100;
        return currentNum;
    }
}
